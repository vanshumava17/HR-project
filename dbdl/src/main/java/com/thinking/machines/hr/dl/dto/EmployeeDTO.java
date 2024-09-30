package com.thinking.machines.hr.dl.dto;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import java.util.*;
import java.math.*;
import com.thinking.machines.enums.*;
public class EmployeeDTO implements EmployeeDTOInterface
{
private String employeeId;
private String name;
private int DesignationCode;
private Date dateOfBirth;
private char gender;
private boolean isIndian;
private BigDecimal basicSalary;
private String panNumber;
private String aadharCardNumber;

public EmployeeDTO()
{
this.employeeId = "";
this.name = "";
this.DesignationCode = 0;
this.dateOfBirth = null;
this.gender = ' ';
this.isIndian = false;
this.basicSalary = null;
this.panNumber = "";
this.aadharCardNumber = "";
}
public void setEmployeeId(java.lang.String employeeId)
{
this.employeeId = employeeId;
}
public java.lang.String getEmployeeId()
{
return this.employeeId;
}
public void setName(java.lang.String name)
{
this.name = name;
}
public java.lang.String getName()
{
return this.name;
}
public void setDesignationCode(int DesignationCode)
{
this.DesignationCode = DesignationCode;
}
public int getDesignationCode()
{
return this.DesignationCode;
}
public void setDateOfBirth(java.util.Date dateOfBirth)
{
this.dateOfBirth = dateOfBirth;
}
public java.util.Date getDateOfBirth()
{
return this.dateOfBirth;
}
public void setGender(GENDER gender)
{
if(gender == GENDER.MALE)this.gender='M';
if(gender == GENDER.FEMALE)this.gender='F';
}
public char getGender()
{
return this.gender;
}
public void setIsIndian(boolean isIndian)
{
this.isIndian = isIndian;
}
public boolean getIsIndian()
{
return this.isIndian;
}
public void setBasicSalary(java.math.BigDecimal basicSalary)
{
this.basicSalary = basicSalary;
}
public java.math.BigDecimal getBasicSalary()
{
return this.basicSalary;
}
public void setPANNumber(java.lang.String panNumber)
{
this.panNumber = panNumber;
}
public java.lang.String getPANNumber()
{
return this.panNumber;
}
public void setAadharCardNumber(java.lang.String aadharCardNumber)
{
this.aadharCardNumber = aadharCardNumber;
}
public java.lang.String getAadharCardNumber()
{
return this.aadharCardNumber;
}
public boolean equals(Object other)
{
if(!(other instanceof EmployeeDTO))return false;
EmployeeDTOInterface employeeDTO = (EmployeeDTOInterface)other;
return this.employeeId.equalsIgnoreCase(employeeDTO.getEmployeeId());
}

public int compareTo(EmployeeDTOInterface other)
{
return this.employeeId.compareToIgnoreCase(other.getEmployeeId());
}
public int hashCode()
{
return this.employeeId.toUpperCase().hashCode();
}
}