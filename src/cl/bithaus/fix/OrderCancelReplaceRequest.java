/*
 * Copyright (c) BitHaus Software Factory & Boutique (Chile)
 * All rights reserved. www.bithaus.cl.
 * 
 * All rights to this product are owned by BitHaus Chile and may only by used 
 * under the terms of its associated license document. 
 * You may NOT copy, modify, sublicense or distribute this source file or 
 * portions of it unless previously authorized by writing by BitHaus Chile.
 * In any event, this notice must always be included verbatim with this file.
 * 
 */

package cl.bithaus.fix;

import cl.bithaus.fix.msg.base.FixGroup;
import java.util.Date;
import java.math.BigDecimal;
import cl.bithaus.fix.components.Parties;
import cl.bithaus.fix.components.Instrument;
import cl.bithaus.fix.components.FinancingDetails;
import cl.bithaus.fix.components.OrderQtyData;
import cl.bithaus.fix.components.PegInstructions;
import cl.bithaus.fix.components.DiscretionInstructions;
import cl.bithaus.fix.components.SpecialOrderData;
import cl.bithaus.fix.components.IIFValorization;
import cl.bithaus.fix.components.IRFValorization;

/**
 * Fix Components Class
 * Generated for FIX 4.4
 * @author Bithaus Fix Message Generator
 */
public class OrderCancelReplaceRequest extends FixBaseMessage {

    private String orderID;           
    private String tradeOriginationDate;           
    private String tradeDate;           
    private String origClOrdID;           
    private String clOrdID;           
    private String secondaryClOrdID;           
    private String clOrdLinkID;           
    private String listID;           
    private Date origOrdModTime;           
    private String settlType;           
    private String settlDate;           
    private String handlInst;           
    private String execInst;           
    private BigDecimal minQty;           
    private BigDecimal maxFloor;           
    private String exDestination;           
    private String side;           
    private Date transactTime;           
    private Integer qtyType;           
    private String ordType;           
    private Integer priceType;           
    private BigDecimal price;           
    private BigDecimal stopPx;           
    private Integer targetStrategy;           
    private String targetStrategyParameters;           
    private BigDecimal participationRate;           
    private Boolean solicitedFlag;           
    private String currency;           
    private String timeInForce;           
    private Date effectiveTime;           
    private Date expireTime;           
    private String text;           
    private BigDecimal orderQty2;           
    private BigDecimal price2;           
    private Boolean locateReqd;           
    private String registID;           
    private String stopPxCondition;           
    private String refOrderID;           
    private String refOrderIDSource;           
    private Integer auctionId;           
    private String dcvTitle;           
    private String expressed;           
    private Integer noOffers;           
    private Parties parties;           
    private Instrument instrument;           
    private FinancingDetails financingDetails;           
    private OrderQtyData orderQtyData;           
    private PegInstructions pegInstructions;           
    private DiscretionInstructions discretionInstructions;           
    private SpecialOrderData specialOrderData;           
    private IIFValorization iIFValorization;           
    private IRFValorization iRFValorization;           

    public OrderCancelReplaceRequest() { 
        super("G", MsgCategory.APP);
    }

    public String getOrderID() {
        return this.orderID;
    }           

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getTradeOriginationDate() {
        return this.tradeOriginationDate;
    }           

    public void setTradeOriginationDate(String tradeOriginationDate) {
        this.tradeOriginationDate = tradeOriginationDate;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }           

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }
    public String getOrigClOrdID() {
        return this.origClOrdID;
    }           

    public void setOrigClOrdID(String origClOrdID) {
        this.origClOrdID = origClOrdID;
    }
    public String getClOrdID() {
        return this.clOrdID;
    }           

    public void setClOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
    }
    public String getSecondaryClOrdID() {
        return this.secondaryClOrdID;
    }           

    public void setSecondaryClOrdID(String secondaryClOrdID) {
        this.secondaryClOrdID = secondaryClOrdID;
    }
    public String getClOrdLinkID() {
        return this.clOrdLinkID;
    }           

    public void setClOrdLinkID(String clOrdLinkID) {
        this.clOrdLinkID = clOrdLinkID;
    }
    public String getListID() {
        return this.listID;
    }           

    public void setListID(String listID) {
        this.listID = listID;
    }
    public Date getOrigOrdModTime() {
        return this.origOrdModTime;
    }           

    public void setOrigOrdModTime(Date origOrdModTime) {
        this.origOrdModTime = origOrdModTime;
    }
    public String getSettlType() {
        return this.settlType;
    }           

    public void setSettlType(String settlType) {
        this.settlType = settlType;
    }
    public String getSettlDate() {
        return this.settlDate;
    }           

    public void setSettlDate(String settlDate) {
        this.settlDate = settlDate;
    }
    public String getHandlInst() {
        return this.handlInst;
    }           

    public void setHandlInst(String handlInst) {
        this.handlInst = handlInst;
    }
    public String getExecInst() {
        return this.execInst;
    }           

    public void setExecInst(String execInst) {
        this.execInst = execInst;
    }
    public BigDecimal getMinQty() {
        return this.minQty;
    }           

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }
    public BigDecimal getMaxFloor() {
        return this.maxFloor;
    }           

    public void setMaxFloor(BigDecimal maxFloor) {
        this.maxFloor = maxFloor;
    }
    public String getExDestination() {
        return this.exDestination;
    }           

    public void setExDestination(String exDestination) {
        this.exDestination = exDestination;
    }
    public String getSide() {
        return this.side;
    }           

    public void setSide(String side) {
        this.side = side;
    }
    public Date getTransactTime() {
        return this.transactTime;
    }           

    public void setTransactTime(Date transactTime) {
        this.transactTime = transactTime;
    }
    public Integer getQtyType() {
        return this.qtyType;
    }           

    public void setQtyType(Integer qtyType) {
        this.qtyType = qtyType;
    }
    public String getOrdType() {
        return this.ordType;
    }           

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }
    public Integer getPriceType() {
        return this.priceType;
    }           

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }
    public BigDecimal getPrice() {
        return this.price;
    }           

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getStopPx() {
        return this.stopPx;
    }           

    public void setStopPx(BigDecimal stopPx) {
        this.stopPx = stopPx;
    }
    public Integer getTargetStrategy() {
        return this.targetStrategy;
    }           

    public void setTargetStrategy(Integer targetStrategy) {
        this.targetStrategy = targetStrategy;
    }
    public String getTargetStrategyParameters() {
        return this.targetStrategyParameters;
    }           

    public void setTargetStrategyParameters(String targetStrategyParameters) {
        this.targetStrategyParameters = targetStrategyParameters;
    }
    public BigDecimal getParticipationRate() {
        return this.participationRate;
    }           

    public void setParticipationRate(BigDecimal participationRate) {
        this.participationRate = participationRate;
    }
    public Boolean getSolicitedFlag() {
        return this.solicitedFlag;
    }           

    public void setSolicitedFlag(Boolean solicitedFlag) {
        this.solicitedFlag = solicitedFlag;
    }
    public String getCurrency() {
        return this.currency;
    }           

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getTimeInForce() {
        return this.timeInForce;
    }           

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }
    public Date getEffectiveTime() {
        return this.effectiveTime;
    }           

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
    public Date getExpireTime() {
        return this.expireTime;
    }           

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
    public String getText() {
        return this.text;
    }           

    public void setText(String text) {
        this.text = text;
    }
    public BigDecimal getOrderQty2() {
        return this.orderQty2;
    }           

    public void setOrderQty2(BigDecimal orderQty2) {
        this.orderQty2 = orderQty2;
    }
    public BigDecimal getPrice2() {
        return this.price2;
    }           

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }
    public Boolean getLocateReqd() {
        return this.locateReqd;
    }           

    public void setLocateReqd(Boolean locateReqd) {
        this.locateReqd = locateReqd;
    }
    public String getRegistID() {
        return this.registID;
    }           

    public void setRegistID(String registID) {
        this.registID = registID;
    }
    public String getStopPxCondition() {
        return this.stopPxCondition;
    }           

    public void setStopPxCondition(String stopPxCondition) {
        this.stopPxCondition = stopPxCondition;
    }
    public String getRefOrderID() {
        return this.refOrderID;
    }           

    public void setRefOrderID(String refOrderID) {
        this.refOrderID = refOrderID;
    }
    public String getRefOrderIDSource() {
        return this.refOrderIDSource;
    }           

    public void setRefOrderIDSource(String refOrderIDSource) {
        this.refOrderIDSource = refOrderIDSource;
    }
    public Integer getAuctionId() {
        return this.auctionId;
    }           

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }
    public String getDcvTitle() {
        return this.dcvTitle;
    }           

    public void setDcvTitle(String dcvTitle) {
        this.dcvTitle = dcvTitle;
    }
    public String getExpressed() {
        return this.expressed;
    }           

    public void setExpressed(String expressed) {
        this.expressed = expressed;
    }
    public Integer getNoOffers() {
        return this.noOffers;
    }           

    public void setNoOffers(Integer noOffers) {
        this.noOffers = noOffers;
    }

    
    public Parties getParties() {
        return this.parties;
    }           

    public void setParties(Parties parties) {
        this.parties = parties;
    }
    
    public Instrument getInstrument() {
        return this.instrument;
    }           

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
    public FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }           

    public void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }
    
    public OrderQtyData getOrderQtyData() {
        return this.orderQtyData;
    }           

    public void setOrderQtyData(OrderQtyData orderQtyData) {
        this.orderQtyData = orderQtyData;
    }
    
    public PegInstructions getPegInstructions() {
        return this.pegInstructions;
    }           

    public void setPegInstructions(PegInstructions pegInstructions) {
        this.pegInstructions = pegInstructions;
    }
    
    public DiscretionInstructions getDiscretionInstructions() {
        return this.discretionInstructions;
    }           

    public void setDiscretionInstructions(DiscretionInstructions discretionInstructions) {
        this.discretionInstructions = discretionInstructions;
    }
    
    public SpecialOrderData getSpecialOrderData() {
        return this.specialOrderData;
    }           

    public void setSpecialOrderData(SpecialOrderData specialOrderData) {
        this.specialOrderData = specialOrderData;
    }
    
    public IIFValorization getIIFValorization() {
        return this.iIFValorization;
    }           

    public void setIIFValorization(IIFValorization iIFValorization) {
        this.iIFValorization = iIFValorization;
    }
    
    public IRFValorization getIRFValorization() {
        return this.iRFValorization;
    }           

    public void setIRFValorization(IRFValorization iRFValorization) {
        this.iRFValorization = iRFValorization;
    }

        
}

