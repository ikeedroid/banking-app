package org.chez_credit.banking_app.repository;

import org.chez_credit.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
    
}
