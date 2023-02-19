/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class IOFile {
    // Đọc lấy dữ liệu từ file
    public static <T> List<T> Read(String file){
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) ois.readObject();
            ois.close();
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return list;
    }
    
    // Cập nhập dữ liệu vào file
    public static <T> void Write(String file, List<T> arr){
        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(file));
            ois.writeObject(arr);
            ois.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
