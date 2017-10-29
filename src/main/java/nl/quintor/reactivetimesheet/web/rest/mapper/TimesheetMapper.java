package nl.quintor.reactivetimesheet.web.rest.mapper;

import lombok.RequiredArgsConstructor;
import nl.quintor.reactivetimesheet.model.Timesheet;
import nl.quintor.reactivetimesheet.repository.TimesheetRepository;
import nl.quintor.reactivetimesheet.web.rest.dto.TimesheetDto;
import org.modelmapper.AbstractProvider;
import org.modelmapper.ModelMapper;
import org.modelmapper.Provider;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by marcel on 28-9-2017.
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TimesheetMapper {
    private ModelMapper modelMapper = new ModelMapper();

    private TimesheetRepository timesheetRepository;

    @PostConstruct
    public void postConstruct() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

        Provider<Timesheet> personProvider = new AbstractProvider<Timesheet>() {
            public Timesheet get() {
                return Timesheet.builder().build();
            }
        };

        Provider<TimesheetDto> dtoProvider = new AbstractProvider<TimesheetDto>() {
            public TimesheetDto get() {
                return TimesheetDto.builder().build();
            }
        };
        modelMapper.createTypeMap(TimesheetDto.class, Timesheet.class)
                .setProvider(personProvider);
        modelMapper.createTypeMap(Timesheet.class, TimesheetDto.class)
                .setProvider(dtoProvider);
    }

    public Timesheet toDomain(final TimesheetDto dto) {
        return modelMapper.map(dto, Timesheet.class);
    }

    public TimesheetDto toDto(final Timesheet ts) {
        return modelMapper.map(ts, TimesheetDto.class);
    }
}
