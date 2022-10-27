package com.luisfelipedejesusm.finalexam.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, Long> {
    List<AccountModel> findAllByOrderByBalanceDesc();


    List<AccountModel> findAllByBalanceGreaterThanEqual(double v);
}
