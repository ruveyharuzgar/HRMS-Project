package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	DataResult<List<VerificationCode>> getAll();
}
