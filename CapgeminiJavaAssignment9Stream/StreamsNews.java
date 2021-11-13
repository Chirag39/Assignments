package CapgeminiJavaAssignment9Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


class StreamsNews{
    public static void main(String[] args ) {

        List<News> list=Arrays.asList(
                new News(123, "Max", "User1", "Finance Minister Nirmala Sitharaman on Saturday said that the government, undeterred by the COVID-19 pandemic, has been pursuing reforms for achieving sustained long-term growth in a bid to make India one of the top economies of the world in the coming decades."),
                new News(234, "Lewis", "User2", "Replying to debate on Budget 2021-22 in Lok Sabha, she said, the Prime Minister did not lose any opportunity to continue with the reforms and this Budget has set the pace for India to become self-reliant or Aatmanirbhar."),
                new News(345, "Charles", "User3", "She Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence."),
                new News(456, "Charles", "User2", "She said her Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence.")
        );

        int count=(int) list.stream()
                .filter(x-> x.comment.contains("Budget"))
                .count();
        System.out.println(count);

        System.out.println("_________________________________________________________________");


        Optional<String> max = list.stream().map(x->x.commentByUser)
                .max((i,j)->i.compareTo(j));
        System.out.println(max.get());

        System.out.println("_________________________________________________________________");

        list.stream().sorted(Comparator.comparing(News::getCommentByUser))
                .forEach(t-> System.out.println(t.getCommentByUser()));

    }

}
class News {

    int newsId;
    String postedByUser;
    String commentByUser;
    String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        super();
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
                + ", comment=" + comment + "]";
    }


}

