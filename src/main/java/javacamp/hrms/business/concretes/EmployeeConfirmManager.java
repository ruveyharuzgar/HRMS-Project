package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.EmployeeConfirmService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.dataAccess.abstracts.EmployeeConfirmDao;
import javacamp.hrms.entities.concretes.EmployeeConfirm;

@Service
public class EmployeeConfirmManager implements EmployeeConfirmService {

	private EmployeeConfirmDao employeeConfirmDao;

	@Autowired
	public EmployeeConfirmManager(EmployeeConfirmDao employeeConfirmDao) {
		super();
		this.employeeConfirmDao = employeeConfirmDao;
	}

	@Override
	public DataResult<List<EmployeeConfirm>> getAll() {
		return new SuccessDataResult<List<EmployeeConfirm>>(this.employeeConfirmDao.findAll(),
				"Employee confirm listed");
	}

}
