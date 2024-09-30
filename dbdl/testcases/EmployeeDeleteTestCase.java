import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;
public class EmployeeDeleteTestCase
{
public static void main(String gg[])
{
String employeeId = gg[0];
try
{
EmployeeDAOInterface employeeDAO = new EmployeeDAO();
EmployeeDTOInterface employeeDTO = new EmployeeDTO();
employeeDAO.delete(employeeId);
System.out.println("Employee with employee id : " + employeeId + " is deleted");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}