package nl.tudelft.oopp.group54.controllers.votes;

import nl.tudelft.oopp.group54.entities.QuestionKey;

import java.util.Map;
import java.util.TreeMap;

public class MockVoteServiceImpl implements VoteService {

    @Override
    public Map<String, Object> voteOnQuestion(Long lectureId, String userId, Long questionId, boolean isUpvote) {
        Map<String, Object> status = new TreeMap<>();

        //QuestionKey currentKey = new QuestionKey(Integer.parseInt(questionId), lectureId.intValue());

//        if(questionMap.containsKey(currentKey)){
//            questionMap.get(currentKey).setVote_counter(questionMap.get(currentKey).getVote_counter() + 1);
//            status.put("success", true);
//            return status;
//        }

        status.put("success", true);
        status.put("message", "upvoted. This will not be in the actual API" +
                ", don't visualize this message in the front-end");

        return status;


    }
}