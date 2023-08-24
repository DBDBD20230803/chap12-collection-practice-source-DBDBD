package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTItle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private ArrayList<BookDTO> booklist;

    public BookManager() {
booklist = new ArrayList<BookDTO>();
    }
    private Scanner sc;



    public void addBook(BookDTO book) {
        booklist.add(book);

    }

    public void deleteBook(int index) {

    }

    public void searchBook(String btitle) {

        int result = -1;

        for (int i = 0; i < booklist.size(); i++) {
            if(booklist.get(i).getTitle().equals(btitle)) {
                result = i;
                break;
            }
        }

        if(result > -1) {
            System.out.println(booklist.get(result));
        } else {
            System.out.println("조회된 도서가 목록에 없습니다.");
        }
    }

    public void displayAll() {
        // 도서목록 전체 출력

        if (booklist.size() > 0) {
            for (BookDTO bookDTO : booklist) {
                System.out.println(bookDTO);
                }
            } else {
                System.out.println("출력결과가 없습니다.");
            }
        }
    public List<BookDTO> sortedBookList(int type) {
        java.util.Comparator[] comparators = {new AscBookNo(), new DescBookNo(), new AscBookTitle(), new DescBookTItle()};
        java.util.Comparator comparator = comparators[type-1];
        Collections.sort(booklist, comparator);
        return booklist;
    }

    public void printBookList(List<BookDTO> printList) {

    }
}
