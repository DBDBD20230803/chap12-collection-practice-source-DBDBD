package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private ArrayList<BookDTO> booklist;
    private Scanner sc;

    public BookManager() {

    }

    public void addBook(BookDTO book) {

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

    }

    public List<BookDTO> sortedBookList(int type) {
        return null;
    }

    public void printBookList(List<BookDTO> printList) {

    }
}
