package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm  = new BookManager();

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

        System.out.print("도서번호(ISBN) : ");
        int bNo = sc.nextInt();

        System.out.print("카테고리 입력(1:인문/ 2:자연과학/3:의료/ 4:기타) : ");
        int category = sc.nextInt();


        System.out.print("도서 제목 : ");
        sc.nextLine();
        String bTitle = sc.nextLine();

        System.out.print("저자 : ");
        String author = sc.nextLine();


        return new BookDTO(bNo, category, bTitle, author);
    }


    public int inputBookNo() {

        System.out.print("도서 번호 : " );
        System.out.println("삭제할 도서의 번호를 입력해 주세요");

        return sc.nextInt();

    }

    public String inputBookTitle() {

        System.out.print("도서 제목 : ");
        String btitle = sc.nextLine();

        return btitle;
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
