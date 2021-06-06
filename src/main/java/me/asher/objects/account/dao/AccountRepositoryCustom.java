package me.asher.objects.account.dao;

import me.asher.objects.account.domain.Account;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface AccountRepositoryCustom {

  List<Account> findByName(String name);
}
