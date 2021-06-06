package me.asher.objects.account.api;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.asher.objects.account.application.AccountService;
import me.asher.objects.entity.Account;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@RequestMapping(value = "/api/v1")
@RestController
public class AccountApi {

  private final AccountService accountService;

  @GetMapping("/account/highest-total-amount")
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public List<Account> findHighestTotalAmountCustomer() {
    return accountService.findHighestTotalAmountCustomer();
  }

}
