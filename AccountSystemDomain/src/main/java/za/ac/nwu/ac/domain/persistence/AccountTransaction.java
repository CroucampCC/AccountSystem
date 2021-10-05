package za.ac.nwu.ac.domain.persistence;



import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "DEMO_ACCOUNT_TYPE",schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable {

    private static final long serialVersionUID = -4491818058246307928L;

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ",sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    private Long transactionId;
    private AccountType accountType;
    private Long memberId;
    private Long ammount;
    private LocalDate trasactionDate;






    public AccountTransaction(Long transactionId, AccountType accountType, Long memberId, Long ammount, LocalDate trasactionDate) {
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.memberId = memberId;
        this.ammount = ammount;
        this.trasactionDate = trasactionDate;
    }

    public AccountTransaction() {
    }
    @Column(name = "TX_ID")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    @Column(name = "MEMBER_ID")
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    @Column(name = "AMMOUNT")
    public Long getAmmount() {
        return ammount;
    }

    public void setAmmount(Long ammount) {
        this.ammount = ammount;
    }
    @Column(name = "TX_DATE")
    public LocalDate getTrasactionDate() {
        return trasactionDate;
    }

    public void setTrasactionDate(LocalDate trasactionDate) {
        this.trasactionDate = trasactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(accountType, that.accountType) && Objects.equals(memberId, that.memberId) && Objects.equals(ammount, that.ammount) && Objects.equals(trasactionDate, that.trasactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, accountType, memberId, ammount, trasactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", accountType=" + accountType +
                ", memberId=" + memberId +
                ", ammount=" + ammount +
                ", trasactionDate=" + trasactionDate +
                '}';
    }
}
