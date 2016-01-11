package com.innoppl.outreach.data.dao.impl;

import com.innoppl.outreach.data.dao.LOVDao;
import com.innoppl.outreach.data.model.LOV;
import com.innoppl.outreach.logger.LoggerUtils;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jerald Mejarla
 */
@Repository("LOVDao")
public class LOVDaoImpl extends AbstractJPADao<LOV, Integer>
        implements LOVDao {

    private final static Logger LOG
            = LoggerFactory.getLogger(LOVDaoImpl.class);
    
    @Override
    public List<LOV> findAllByType(Integer type) {
        LOG.debug("Looking up LOV values for type " + type);
        try {

            /*
                addressDataQuality(1),
                disabilityType(2),
                dobDataQuality(3),
                employmentType(4),
                ethnicity(5),
                fiveValDKRefused(6),
                fysbReasonNoServices(7),
                gender(8),
                householdType(9),
                housingStatus(10),
                militaryBranch(11),
                monthsHomelessPastThreeYears(12),
                nameDataQuality(13),
                noYes(14),
                noYesRefused(15),
                pathHowConfirmed(16),
                pathSMIInformation(17),
                projectType(18),
                race(19),
                reasonNotEnrolled(20),
                referralOutcome(21),
                referralSourceSimple(22),
                relationshipToHoH(23),
                residencePrior(24),
                residencePriorLengthOfStay(25),
                ssnDataQuality(26),
                state(27),
                timesHomelessPastThreeYears(28),
                recordType(29);
                */

                // TOOD: OH GOD THIS IS SO BAD -- right now LOV is just a giant cluster of "this is NOT AT ALL the way compass ROSE handles values."
                // It needs a complete rewrote
                // In the mean time, we're going to just route the code (which is defined in the LOVType.java) to the proper model; this should NOT be hard coded the way it is hard coded.

        	
        	switch(type) {
                case 1: // addressDataQuality
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVAddressDataQuality u")
                            .getResultList();

                case 2: // disabilityType
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVDisabilityType u")
                            .getResultList();

                case 3: // dobDataQuality
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVDobDataQuality u")
                            .getResultList();


                case 4: // employmentType
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVEmploymentType u")
                            .getResultList();

                case 5: // ethnicity
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVEthnicity u")
                            .getResultList();

                case 6: // fiveValDKRefused
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVFiveValDKRefused u")
                            .getResultList();

                case 7: // fysbReasonNoServices
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVFysbReasonNoServices u")
                            .getResultList();

                case 8: // gender
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVGender u")
                            .getResultList();

                case 9: // householdType
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVHouseholdType u")
                            .getResultList();

                case 10: // housingStatus
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVHousingStatus u")
                            .getResultList();

                case 11: // militaryBranch
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVMilitaryBranch u")
                            .getResultList();

                case 12: // monthsHomelessPastThreeYears
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVMonthsHomelessPastThreeYears u")
                            .getResultList();

                case 13: // nameDataQuality
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVNameDataQuality u")
                            .getResultList();

                case 14: // noYes
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVNoYes u")
                            .getResultList();

                case 15: // noYesRefused
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVNoYesRefused u")
                            .getResultList();

                case 16: // pathHowConfirmed
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVPathHowConfirmed u")
                            .getResultList();

                case 17: // pathSMIInformation
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVPathSMIInformation u")
                            .getResultList();

                case 18: // projectType
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVProjectType u")
                            .getResultList();

                case 19: // race
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVRace u")
                            .getResultList();

                case 20: // reasonNotEnrolled
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVReasonNotEnrolled u")
                            .getResultList();

                case 21: // referralOutcome
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVReferralOutcome u")
                            .getResultList();

                case 22: // referralSourceSimple
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVReferralSourceSimple u")
                            .getResultList();

                case 23: // relationshipToHoH
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVRelationshipToHoH u")
                            .getResultList();

                case 24: // residencePrior
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVResidencePrior u")
                            .getResultList();

                case 25: // residencePriorLengthOfStay
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVresidencePriorLengthOfStay u")
                            .getResultList();

                case 26: // ssnDataQuality
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVSsnDataQuality u")
                            .getResultList();

                case 27: // state
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVState u")
                            .getResultList();

                case 28: // timesHomelessPastThreeYears
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVTimesHomelessPastThreeYears u")
                            .getResultList();

                case 29: // recordType
                    return (List<LOV>) getEntityManager().createQuery(
                            "select u from LOVRecordType u")
                            .getResultList();

        		default:
		            return null;
        	}
        } catch (Exception ex) {
            LOG.error(LoggerUtils.getStackTrace(ex));
            return null;
        }
    }

    @Override
    public LOV findByTypeAndValue(Integer type, String value) {
        LOG.debug("Looking up LOV values for type " + type + " and value " + value);
        try {

            switch(type) {
                case 1: // addressDataQuality
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVAddressDataQuality u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Terrible.
                            .getSingleResult();

                case 2: // disabilityType
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVDisabilityType u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 3: // dobDataQuality
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVDobDataQuality u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();


                case 4: // employmentType
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVEmploymentType u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 5: // ethnicity
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVEthnicity u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 6: // fiveValDKRefused
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVFiveValDKRefused u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 7: // fysbReasonNoServices
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVFysbReasonNoServices u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 8: // gender
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVGender u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 9: // householdType
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVHouseholdType u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 10: // housingStatus
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVHousingStatus u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 11: // militaryBranch
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVMilitaryBranch u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 12: // monthsHomelessPastThreeYears
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVMonthsHomelessPastThreeYears u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 13: // nameDataQuality
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVNameDataQuality u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 14: // noYes
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVNoYes u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 15: // noYesRefused
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVNoYesRefused u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 16: // pathHowConfirmed
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVPathHowConfirmed u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 17: // pathSMIInformation
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVPathSMIInformation u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 18: // projectType
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVProjectType u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 19: // race
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVRace u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 20: // reasonNotEnrolled
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVReasonNotEnrolled u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 21: // referralOutcome
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVReferralOutcome u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 22: // referralSourceSimple
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVReferralSourceSimple u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 23: // relationshipToHoH
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVRelationshipToHoH u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 24: // residencePrior
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVResidencePrior u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 25: // residencePriorLengthOfStay
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVresidencePriorLengthOfStay u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 26: // ssnDataQuality
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVSsnDataQuality u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 27: // state
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVState u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 28: // timesHomelessPastThreeYears
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVTimesHomelessPastThreeYears u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                case 29: // recordType
                    return (LOV) getEntityManager().createQuery(
                            "select u from LOVRecordType u where u.id = :value")
                            .setParameter("value", Integer.parseInt(value)) // TODO: Still terrible.
                            .getSingleResult();

                
                default:
                    return null;
            }
        } catch (Exception ex) {
            LOG.error(LoggerUtils.getStackTrace(ex));
            return null;
        }
    }
}
