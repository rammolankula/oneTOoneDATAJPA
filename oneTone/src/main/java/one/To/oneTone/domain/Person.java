package one.To.oneTone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Person {
	/*Here HAS A relationship oneTOone mapping
	 * person has  pancard 
	 * we need to think generlly oneTOone like 1.person has pancard But 2.pancard does'nt has person
	 * Parent class is person and 
	 * Child class is pancard */
	@Id
	@NonNull
	private Integer personId;
	private String personName;
	private String personAddress;
	private String Gender;
/*Implementation of oneTOone mapping here we used @ManyToOne but joining column has  unique=true means oneTOone */
	@ManyToOne
	@JoinColumn(name="panFk",unique=true)
	private Pancard pandata; 
}
