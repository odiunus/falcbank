package com.falcbank.falcbank.repositories;

import com.falcbank.falcbank.models.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository  extends JpaRepository<AccountModel,Long> {

    Optional<AccountModel> findByClientModel_Id(Long aLong);
}
