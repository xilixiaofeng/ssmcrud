package com.atguigu.crud.service;

import com.atguigu.crud.bean.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();


//
    int saveEmp(Employee employee);

//    校验
    boolean checkUser(String empName);


    Employee getEmp(Integer id);

    void updateEmp(Employee employee);

    //单个删除
    void deleteEmp(Integer id);

    //    批量删除
    void deleteBatch(List<Integer> ids);
}
