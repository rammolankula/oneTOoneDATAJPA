package one.To.oneTone.domain;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Pancard {
	@Id
	@NonNull
	private Integer panId;
	private String panName;
	private String panHolder;
	@Temporal(TemporalType.DATE)
	private Date issureDate;
}
