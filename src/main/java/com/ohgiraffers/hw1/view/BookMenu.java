package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc;
    private BookManager bm;

    public BookMenu() {

    }

    public void mainMenu() {

    }

    public BookDTO inputBook() {
        return null;
    }

    public String inputBookNo() {
        return null;
    }

    public String inputBookTitle() {
        return null;
    }

    public List<BookDTO> selectSortedBook() {
        sc = new Scanner(System.in);
        System.out.print("원하는 정렬방식을 선택해주세요 : ");
        System.out.println("1. 책 번호 기준으로 오름차순");
        System.out.println("2. 책 번호 기준으로 내림차순");
        System.out.println("3. 책 제목 기준으로 오름차순");
        System.out.println("4. 책 제목 기준으로 내림차순");
        try {
            int num = sc.nextInt();
            bm.sortedBookList(num);
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        }
        return null;
    }
}
