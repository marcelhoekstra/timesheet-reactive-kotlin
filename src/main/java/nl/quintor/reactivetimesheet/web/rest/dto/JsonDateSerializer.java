package nl.quintor.reactivetimesheet.web.rest.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.commons.lang3.time.FastDateFormat;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;



@Component
public class JsonDateSerializer extends JsonSerializer<Date> {
	private static final FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

	@Override
	public void serialize(Date date, JsonGenerator gen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {

		if (date == null) {
			gen.writeNull();
		} else {
			String formattedDate = dateFormat.format(date);
			gen.writeString(formattedDate);
		}	
	}

}