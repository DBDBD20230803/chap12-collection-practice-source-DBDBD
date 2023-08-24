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
    private Scanner sc;

    public BookManager() {

    }

    public void addBook(Book book) {

    }

    public void deleteBook(int index) {

    }

    public void searchBook(String btitle) {

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
