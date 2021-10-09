package za.ac.nwu.account.logic.flow;


import za.ac.nwu.account.domain.dto.AccountTypeDto;
import za.ac.nwu.account.translator.AccountTypeTranslator;

public interface CreateAccountTypeFlow {

    AccountTypeTranslator create(AccountTypeDto accountType);
}