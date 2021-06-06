package me.asher.objects.account.dao;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import me.asher.objects.account.domain.Account;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Repository
@Transactional
public class AccountRepositoryImpl extends QuerydslRepositorySupport implements AccountRepositoryCustom {

  private final JPAQueryFactory queryFactory;

  public AccountRepositoryImpl(JPAQueryFactory queryFactory) {
    super(Account.class);
    this.queryFactory = queryFactory;
  }

  @Transactional(readOnly = true)
  @Override
  public List<Account> findByName(String name) {
    return null;
  }
}
