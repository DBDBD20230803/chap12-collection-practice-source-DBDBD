package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

public class AscBookNo implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BookDTO bookDTO1 = (BookDTO) o1;
        BookDTO bookDTO2 = (BookDTO) o2;
        return bookDTO1.getbNo() - bookDTO2.getbNo();
    }
}
