package com.jhopesoft.framework.dao.entity.dataobject;
// Generated 2016-11-3 11:11:36 by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.jhopesoft.framework.dao.entityinterface.ParentChildField;
import com.jhopesoft.framework.dao.entity.utils.FFunction;
/**
 * FDataobjectdefaultorder generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@DynamicUpdate
@Table(name = "f_dataobjectdefaultorder", uniqueConstraints = @UniqueConstraint(columnNames = {"objectid", "orderno"}))
@Cache(region = "beanCache", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FDataobjectdefaultorder implements java.io.Serializable, ParentChildField {

  private String defaultorderid;
  private FDataobject FDataobject;
  private FDataobjectfield FDataobjectfield;
  private FFunction FFunction;
  private Integer orderno;
  private String fieldahead;
  private String aggregate;
  private String fieldfunction;
  private String direction;

  public FDataobjectdefaultorder() {}

  @GenericGenerator(name = "generator", strategy = "uuid.hex")
  @Id
  @GeneratedValue(generator = "generator")
  @Column(name = "defaultorderid", unique = true, nullable = false, length = 40)
  public String getDefaultorderid() {
    return this.defaultorderid;
  }

  public void setDefaultorderid(String defaultorderid) {
    this.defaultorderid = defaultorderid;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "objectid", nullable = false)
  public FDataobject getFDataobject() {
    return this.FDataobject;
  }

  public void setFDataobject(FDataobject FDataobject) {
    this.FDataobject = FDataobject;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fieldid", nullable = false)
  public FDataobjectfield getFDataobjectfield() {
    return this.FDataobjectfield;
  }

  public void setFDataobjectfield(FDataobjectfield FDataobjectfield) {
    this.FDataobjectfield = FDataobjectfield;
  }


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "functionid")
  public FFunction getFFunction() {
    return this.FFunction;
  }

  public void setFFunction(FFunction FFunction) {
    this.FFunction = FFunction;
  }
  
  @Column(name = "orderno", nullable = false)
  public Integer getOrderno() {
    return this.orderno;
  }

  public void setOrderno(Integer orderno) {
    this.orderno = orderno;
  }

  @Column(name = "fieldahead", length = 200)
  public String getFieldahead() {
    return this.fieldahead;
  }

  public void setFieldahead(String fieldahead) {
    this.fieldahead = fieldahead;
  }

  @Column(name = "aggregate", length = 20)
  public String getAggregate() {
    return this.aggregate;
  }

  public void setAggregate(String aggregate) {
    this.aggregate = aggregate;
  }

  @Column(name = "fieldfunction", length = 200)
  public String getFieldfunction() {
    return this.fieldfunction;
  }

  public void setFieldfunction(String fieldfunction) {
    this.fieldfunction = fieldfunction;
  }

  @Column(name = "direction", length = 10)
  public String getDirection() {
    return this.direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  @Override
  @Transient
  public FDataobjectcondition getFDataobjectconditionBySubconditionid() {
    return null;
  }

  @Override
  public void setFDataobjectconditionBySubconditionid(FDataobjectcondition value) {}

  @Override
  @Transient
  public String getCondition() {
    return null;
  }

  @Override
  public void setCondition(String value) {    
  }

  @Override
  @Transient
  public String getRemark() {
    return null;
  }

  @Override
  public void setRemark(String value) {    
  }

}
