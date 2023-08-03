package com.voterapp.client;
import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class VoterAppMain {

	public static void main(String[] args) {
		IElectionBooth electionBooth = new ElectionBoothImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age = scanner.nextInt();
		System.out.print("Enter your Locality : ");
		String locality = scanner.next();
		System.out.print("Enter your Voter ID : ");
		int voterId = scanner.nextInt();
		
		try {
			if(electionBooth.checkEligibility(age, locality, voterId)) {
				System.out.println("You are ready to avail your vote. Now you can Vote.");
			}
			else
				throw new InValidVoterException("In Valid for Voting");
		} catch (InValidVoterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("close");
		}
		scanner.close();
	}

}
