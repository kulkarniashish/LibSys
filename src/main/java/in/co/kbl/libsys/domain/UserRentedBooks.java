/**
 * 
 */
package in.co.kbl.libsys.domain;

import in.co.kbl.libsys.model.DateRange;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author ashish
 * 
 */
@Entity
@Table(name = "rented_books", catalog = "library")
public class UserRentedBooks implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4296480356732658135L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	@JoinColumn(name = "book_id")
	private Book book;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Embedded
	private DateRange rentedDate;

	private Date returnedDate;

	/**
	 * @return the bookId
	 */
	public Book getBookId() {
		return book;
	}

	/**
	 * @return the rentedBookId
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the rentedDate
	 */
	public DateRange getRentedDate() {
		return rentedDate;
	}

	/**
	 * @return the returnedDate
	 */
	public Date getReturnedDate() {
		return returnedDate;
	}

	/**
	 * @return the userId
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param bookId
	 *            the bookId to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @param rentedBookId
	 *            the rentedBookId to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param rentedDate
	 *            the rentedDate to set
	 */
	public void setRentedDate(DateRange rentedDate) {
		this.rentedDate = rentedDate;
	}

	/**
	 * @param returnedDate
	 *            the returnedDate to set
	 */
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
