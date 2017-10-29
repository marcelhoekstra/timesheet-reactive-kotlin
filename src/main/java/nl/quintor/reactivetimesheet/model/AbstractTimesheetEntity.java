package nl.quintor.reactivetimesheet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Super class voor Entities zodat id en version overal gebruikt wordt.
 * @author marcel
 *
 */
@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class AbstractTimesheetEntity {
	@Id	@GeneratedValue	protected Long id;
	@Version protected Integer version;



}
