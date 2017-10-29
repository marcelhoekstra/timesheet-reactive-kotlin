package nl.quintor.reactivetimesheet.web.rest.mapper;

import nl.quintor.reactivetimesheet.model.Medewerker;
import nl.quintor.reactivetimesheet.model.Timesheet;
import nl.quintor.reactivetimesheet.web.rest.dto.MedewerkerDto;
import nl.quintor.reactivetimesheet.web.rest.dto.TimesheetDto;
import org.modelmapper.AbstractProvider;
import org.modelmapper.ModelMapper;
import org.modelmapper.Provider;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
public class AutoMapper {
    public static ModelMapper modelMapper;

    public AutoMapper() {
        modelMapper = new ModelMapper();
//        PropertyMap<Auto, AutoDto> autoMap = new PropertyMap<Auto, AutoDto>() {
//            protected void configure() {
//
//            }
//        };

//        Converter<TimesheetDto, Timesheet> timesheetFactory =
//                ctx -> ctx.getSource().getId() == null ? Timesheet.builder().build() : Timesheet.builder().jaar(2).build();
//
//        modelMapper.addConverter(timesheetFactory);


//        modelMapper.addMappings(autoMap);
    }

    public static void main(String args[]) {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

        Medewerker medewerker = Medewerker.builder().achterNaam("Hoekstra").build();
        Timesheet ts = Timesheet.builder()
                .jaar(200)
                .medewerker(medewerker)
                .build();


        Provider<Timesheet> personProvider = new AbstractProvider<Timesheet>() {
            public Timesheet get() {
                System.out.println("create");
                return Timesheet.builder().build();
            }
        };

        Provider<TimesheetDto> dtoProvider = new AbstractProvider<TimesheetDto>() {
            public TimesheetDto get() {
                System.out.println("create");
                return TimesheetDto.builder().build();
            }
        };
        Provider<MedewerkerDto> mdtoProvider = new AbstractProvider<MedewerkerDto>() {
            public MedewerkerDto get() {
                System.out.println("create");
                return MedewerkerDto.builder().build();
            }
        };



        modelMapper.createTypeMap(Medewerker.class, MedewerkerDto.class).setProvider(mdtoProvider);
        modelMapper.createTypeMap(TimesheetDto.class, Timesheet.class)
                .setProvider(personProvider);
        modelMapper.createTypeMap(Timesheet.class, TimesheetDto.class)
                .setProvider(dtoProvider);


        TimesheetDto dest = modelMapper.map(ts, TimesheetDto.class);

        System.out.println(dest);
//        System.out.println(dest.id);
//        System.out.println(dest.getJaar());
//        System.out.println(dest.getVersion());
//        System.out.println(dest.getMedewerker());
//        final Timesheet bla = bm.map(ts);
//
//                System.out.println(bla.getId());
    }




}
