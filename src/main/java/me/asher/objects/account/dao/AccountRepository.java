package me.asher.objects.account.dao;

import me.asher.objects.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface AccountRepository extends JpaRepository<Account, Long>, AccountRepositoryCustom {

}
