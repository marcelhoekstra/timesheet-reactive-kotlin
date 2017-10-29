package nl.quintor.reactivetimesheet;

import lombok.RequiredArgsConstructor;
import nl.quintor.reactivetimesheet.repository.MedewerkerRepository;
import nl.quintor.reactivetimesheet.repository.TimesheetRepository;
import nl.quintor.reactivetimesheet.web.rest.dto.TimesheetDto;
import nl.quintor.reactivetimesheet.web.rest.mapper.TimesheetMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.stream.Collectors;

/**
 * Created by marcel on 20-9-2017.
 */
@RestController
@RequiredArgsConstructor
@Transactional
public class TimesheetRoutes {

    private final TimesheetRepository timesheetRepository;
    private final MedewerkerRepository medewerkerRepository;
    private final TimesheetMapper timesheetMapper;

    @GetMapping(path = "/timesheets")
    public Flux<TimesheetDto> handleMessage() {
        return Flux.fromIterable(this.timesheetRepository.findAll()
                .stream()
                .map(timesheetMapper::toDto)
                .collect(Collectors.toList()));
    }
}
