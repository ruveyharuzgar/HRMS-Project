package javacamp.hrms.business.validationRules;

import java.util.Date;

import javacamp.hrms.core.utilities.results.Result;

public interface MernisVerificationService {
	Result checkIfRealPerson(String identityNumber, String firstName, String lastName, Date birthDate);
}
