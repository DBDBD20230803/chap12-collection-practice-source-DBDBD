package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public BookMenu() {

    }

    public void mainMenu() {

        // 메뉴 번호 선택 : >> 입력받음

    }

    public BookDTO inputBook() {

        //매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO 객체 리턴
        return null;
    }

    public String inputBookNo() {

        System.out.print("도서 번호 : " );
        System.out.println("삭제할 도서의 번호를 입력해 주세요");

        return sc.nextInt();
    }

    public String inputBookTitle() {
        return null;
    }

    public List<BookDTO> selectSortedBook() {
        bm = new BookManager();
        sc = new Scanner(System.in);
        System.out.println("1. 도서번호(ISBN) 기준으로 오름차순");
        System.out.println("2. 도서번호(ISBN) 기준으로 내림차순");
        System.out.println("3. 책 제목 기준으로 오름차순");
        System.out.println("4. 책 제목 기준으로 내림차순");
        System.out.print("원하는 정렬방식을 선택해주세요 : ");
        try {
            int num = sc.nextInt();
            List<BookDTO> bookList = bm.sortedBookList(num);
            return bookList;
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다.");
        }
        return null;
    }
}
