package com.eazybytes.loans.mapper;

import com.eazybytes.loans.dto.LoansDto;
import com.eazybytes.loans.entity.Loans;

public class LoansMapper {

    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto){
        loansDto.setLoanType(loans.getLoanType());
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setAmountPaid(loans.getAmountPaid());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        return loansDto;
    }

    public static Loans mapToLoans(LoansDto loansDto, Loans loans){
        loans.setLoanType(loansDto.getLoanType());
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setTotalLoan(loansDto.getTotalLoan());
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setAmountPaid(loansDto.getAmountPaid());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());
        return loans;
    }

}
