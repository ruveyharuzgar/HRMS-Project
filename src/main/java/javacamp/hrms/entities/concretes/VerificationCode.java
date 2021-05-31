package javacamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="verification_codes")
public class VerificationCode {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_verified", columnDefinition = "boolean default true")
	private boolean isVerified;
	
	@Column(name="verified_date")
	private LocalDate verifiedDate;
	
	@Column(name="created_date", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();
	
	@Column(name="expired_date")
	private LocalDate expiredDate;

}
