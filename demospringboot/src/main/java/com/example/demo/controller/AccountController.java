package com.example.demo.controller;

import com.example.demo.model.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{id}/{customerName}")
    public ResponseEntity<?> index(@PathVariable int id,
                                   @PathVariable String customerName,
                                   @RequestParam(required = false) String address){
        // @RequestParam(required = false) bgiá trị có bắt buộc nhập hay không sử dụng required, mặc định luôn là true
        // @RequestParam nhận giá trị được truyền trong phương thức get( sau dấu ?address=giá trị)
        return new ResponseEntity<>("Hello Resfull API " + id + " " + customerName + " " + address, HttpStatus.OK);
        // Dấu ? ại diện cho kiểu trả về tại body
    }

    /**
     *
     * Các type truyền dữ liệu ngầm trong String
     * 1) url- encoded: truyền dữ liệu ngầm nhưng không đính kèm file
     * 2) form-data: truyền dữ liệu ngầm có đính kèm file(LÀM BIẾN BÌNH THƯỜNG)
     * 3) raw body: truyền dữ liệu ngầm nhưng dạng JSON(QUY VỀ ĐỐI TƯỢNG)
     */

    @PostMapping("/{id}")
    public ResponseEntity<?> insertAccount(@PathVariable int id,
                                           @RequestBody AccountModel accountModel){
//        AccountModel accountModel = new AccountModel();
//        accountModel.setId(1+id);
//        accountModel.setCustomerName("Nguyen Van A");
//        accountModel.setAge(18);
        return new ResponseEntity<>(accountModel, HttpStatus.OK);
    }
}
