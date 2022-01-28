package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by @author issaclee725 on 27/01/2022
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRespository publisherRespository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRespository publisherRespository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRespository = publisherRespository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book hp = new Book("ms", "1234");
        eric.getBooks().add(hp);
        hp.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(hp);

        Author John = new Author("John", "Shaw");
        Book hp2 = new Book("program book", "34342341234");
        John.getBooks().add(hp2);
        hp2.getAuthors().add(John);

        authorRepository.save(John);
        bookRepository.save(hp2);

        Publisher test = new Publisher("Isaac", "1 Belmoral Dernacount", "Adelaide", "SA", "5085");
        hp2.setPublisher(test);

        test.getBooks().add(hp2);
        test.getBooks().add(hp);

        publisherRespository.save(test);



        System.out.println("Started  in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publisher: " + publisherRespository.count());
        System.out.println("Publisher number of Books: " +  test.getBooks().size());
    }
}
