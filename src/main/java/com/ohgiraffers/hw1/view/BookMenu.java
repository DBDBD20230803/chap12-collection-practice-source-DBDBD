package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

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
        return null;
    }
}
