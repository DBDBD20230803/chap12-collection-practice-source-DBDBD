package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

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
        System.out.println("1. 책 번호 기준으로 오름차순");
        System.out.println("2. 책 번호 기준으로 내림차순");
        System.out.println("3. 책 제목 기준으로 오름차순");
        System.out.println("4. 책 제목 기준으로 내림차순");
        System.out.println("메뉴에서 나가고 싶으시면 위 숫자에 해당하지 않는 것을 입력해주세요");
        System.out.print("원하는 정렬방식을 선택해주세요 : ");
        int num = sc.nextInt();

        return null;
    }
}
