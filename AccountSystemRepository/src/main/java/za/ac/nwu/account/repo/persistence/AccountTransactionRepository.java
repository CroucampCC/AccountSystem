package za.ac.nwu.account.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.account.domain.persistence.AccountTransaction;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {


    @Query(value = "SELECT " +
            "       atr" +
            "   FROM " +
            "       AccountTransaction atr" +
            "   WHERE atr.memberID = :memberID ")
    AccountTransaction getAccountTransactionByMemberID(Long memberID); // <--testing it with AccountTransactionDto class instead of [AccountTransaction(Original)]

    @Query(value = "SELECT " +
            "       atr" +
            "   FROM " +
            "       AccountTransaction atr" +
            "   WHERE atr.transactionID = :transactionID ")
    AccountTransaction getAccountTransactionByPk(Long transactionID); // <--testing it with AccountTransactionDto class instead of [AccountTransaction(Original)]


}
