package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Книга из UniLibrary ");
    }

    public void  returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал UniLibrary");
    }

    public void  returnMagazine(){
        System.out.println("Мы возвращаем журнал в UniLibrary");
    }

    public void addBook(){
        System.out.println("Добавляем книгу в UniLibrary ");
    }

    public void addMagazine(){
        System.out.println("Добавляем журнал в UniLibrary ");
    }


}
