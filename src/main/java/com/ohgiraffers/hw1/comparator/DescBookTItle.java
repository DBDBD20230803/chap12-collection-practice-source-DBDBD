package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

public class DescBookTItle implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BookDTO bookDTO1 = (BookDTO) o1;
        BookDTO bookDTO2 = (BookDTO) o2;
        for(int i = 0; i<Math.min(bookDTO1.getTitle().length(), bookDTO2.getTitle().length()); i++) {
            if(bookDTO1.getTitle().charAt(i) < bookDTO2.getTitle().charAt(i)) {
                return 1;
            } else if(bookDTO1.getTitle().charAt(i) > bookDTO2.getTitle().charAt(i)) {
                return -1;
            } else if(bookDTO1.getTitle().length() < bookDTO2.getTitle().length()) {
                return 1;
            } else if(bookDTO1.getTitle().length() > bookDTO2.getTitle().length()) {
                return -1;
            }
        }
        return 0;
    }
}
