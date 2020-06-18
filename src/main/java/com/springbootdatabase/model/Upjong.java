package com.springbootdatabase.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Upjong {

   private String[] dong;
   private String count;

    public String[] getDong() {
        return dong;
    }

    public void setDong(String[] dong) {
        this.dong = dong;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
