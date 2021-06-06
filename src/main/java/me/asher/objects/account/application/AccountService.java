package me.asher.objects.account.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.asher.objects.account.dao.AccountRepository;
import me.asher.objects.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class AccountService {

  private final AccountRepository accountRepository;

  @Transactional(readOnly = true)
  public List<Account> findHighestTotalAmountCustomer() {
    return accountRepository.findByName("제이");
  }
}
