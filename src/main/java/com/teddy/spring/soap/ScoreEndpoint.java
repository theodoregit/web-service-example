package com.teddy.spring.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.teddy.jee.spring.GetDetailsRequest;
import com.teddy.jee.spring.GetDetailsResponse;
import com.teddy.jee.spring.GetTxnRequest;
import com.teddy.jee.spring.GetTxnResponse;
import com.teddy.jee.spring.GetScoreRequest;
import com.teddy.jee.spring.GetScoreResponse;
import com.teddy.jee.spring.Score;
import com.teddy.jee.spring.Details;
import com.teddy.jee.spring.Txn;


@Endpoint
public class ScoreEndpoint {

	@PayloadRoot(namespace = "http://soap.jee.mcnz.com/", localPart = "getScoreRequest")
	@ResponsePayload
	public GetScoreResponse getScore(@RequestPayload GetScoreRequest request) {
		Score score = new Score();
		if (request.getName().equalsIgnoreCase("teddy") && request.getDepartment().equalsIgnoreCase("SDC")) {
			score.setWins(100);
		} else {
			score.setWins(99);
			score.setLosses(66);
			score.setTies(7);
			score.setDraws(0);
		}
		GetScoreResponse response = new GetScoreResponse();
		response.setScore(score);
		return response;
	}
	
	@PayloadRoot(namespace = "http://soap.jee.mcnz.com/", localPart = "getDetailsRequest")
	@ResponsePayload
	public GetDetailsResponse getDetails(@RequestPayload GetDetailsRequest request) {
		Details details = new Details();
		
		String fullname = request.getName();

		details.setFullname(fullname);
		details.setUnit("SDC");
		details.setSalary(65322.21);
		details.setSupervisor("Genet");
		details.setPosition("Tech Lead");
			
		GetDetailsResponse response = new GetDetailsResponse();		
		response.setDetails(details);
		return response;
	}
	
	@PayloadRoot(namespace = "http://soap.jee.mcnz.com/", localPart = "getTxnRequest")
	@ResponsePayload
	public GetTxnResponse getTxn(@RequestPayload GetTxnRequest request) {
		System.out.println("txn endpoint");
		Txn txn = new Txn();
		
		String date = request.getDate();
		txn.setDate(date);
		txn.setTxnRef("FT253696WWW");
			
		GetTxnResponse response = new GetTxnResponse();		
		response.setTxn(txn);
		return response;
	}

}

