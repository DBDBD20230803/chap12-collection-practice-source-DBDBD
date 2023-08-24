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

    do {
        System.out.println("*** 도서 관리 프로그램 ***");
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서정보 정렬 후 출력");
        System.out.println("3. 도서 삭제");
        System.out.println("4. 도서 검색출력");
        System.out.println("5. 전체 출력");
        System.out.println("6. 끝내기");

        int select = sc.nextInt();

        switch (select) {
            case 1 : bm.addBook(inputBook()); break;
            case 2 : bm.printBookList(selectSortedBook()); break;
            case 3 : bm.deleteBook(inputBookNo()); break;
            case 4 : bm.searchBook(inputBookTitle()); break;
            case 5 : bm.displayAll(); break;
            case 6 : System.out.println("프로그램을 종료합니다."); return;
            default : System.out.println("잘못 입력하셨습니다.");
        }

    }while (true);
}

    public BookDTO inputBook() {
        return null;
    }

    public int inputBookNo() {
        return 0;
    }

    public String inputBookTitle() {

        System.out.print("도서 제목 : ");
        String btitle = sc.nextLine();

        return btitle;
    }

    public List<BookDTO> selectSortedBook() {
        return null;
    }
}
