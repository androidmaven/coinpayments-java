***REMOVED***
***REMOVED***
***REMOVED***
***REMOVED*** Licensed under the Apache License, Version 2.0 (the "License");
***REMOVED*** you may not use this file except in compliance with the License.
***REMOVED*** You may obtain a copy of the License at
***REMOVED***
***REMOVED***         http://www.apache.org/licenses/LICENSE-2.0
***REMOVED***
***REMOVED*** Unless required by applicable law or agreed to in writing, software
***REMOVED*** distributed under the License is distributed on an "AS IS" BASIS,
***REMOVED*** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
***REMOVED*** See the License for the specific language governing permissions and
***REMOVED*** limitations under the License.
***REMOVED***/
package org.brunocvcunha.coinpayments.model;

import java.math.BigInteger;
***REMOVED***

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

***REMOVED***
***REMOVED*** Search Result
***REMOVED*** 
***REMOVED*** @author Bruno Candido Volpato da Cunha
***REMOVED***
***REMOVED***/
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDetailsResponse {

    @JsonProperty("time_created")
    private long timeCreated;

    @JsonProperty("time_expires")
    private long timeExpires;
    
    private int status;

    @JsonProperty("status_text")
    private String statusText;
    
    private String type;
    
    private String coin;
    
    private BigInteger amount;
    
    private double amountf;
    
    private BigInteger received;
    
    private double receivedf;

    @JsonProperty("recv_confirms")
    private int confirmations;
    
    @JsonProperty("payment_address")
    private String paymentAddress;
    
    private Map<String, Object> checkout;

***REMOVED***