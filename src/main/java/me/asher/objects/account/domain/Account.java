package me.asher.objects.account.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.asher.objects.global.common.BaseEntity;

import javax.persistence.*;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "ACCOUNT")
@Entity
public class Account extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // delegate key generation method to database
  @Column(name = "ID", nullable = false)
  private Long id;

  @Column(name = "ACCOUNT_NUMBER", nullable = false, unique = true)
  private String accountNumber;

  @Column(name = "ACCOUNT_NAME", nullable = false)
  private String accountName;

//  @JsonProperty(value = "marketCode")
//  @JsonIdentityReference(alwaysAsId = true)
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "MARKET_CODE", referencedColumnName = "MARKET_CODE", nullable = false)
//  private Market market;
//
//  @JsonIgnore
//  @Builder.Default
//  @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
//  private Set<Dealing> dealings = new HashSet<>();

}
