package com.senon.mvpretrofitrx.mvp.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2018/8/18.
 */

public class NewsDetail implements Parcelable{

    /**
     * boardid : news_shehui7_bbs
     * daynum : 17761
     * digest : 今天上午，记者接到市民爆料，称浦东新区民春路民雷路路口发生一起车祸，现场有人员伤亡。记者了解到，事故中的肇事驾驶员已被警方控制，排除酒驾、毒驾嫌疑。目击者介绍，
     * docid : DPGJ5CPS0001875P
     * imgsrc : http://cms-bucket.nosdn.127.net/2018/08/18/e434659ab1ba4847a2c402d78a77a481.png
     * lmodify : 2018-08-18 15:44:20
     * ltitle : 上海一司机开车撞倒行人后又连撞3车 行人不幸身亡
     * mtime : 2018-08-18 15:44:20
     * postid : DPGJ5CPS0001875P
     * priority : 107
     * ptime : 2018-08-18 15:25:15
     * replyCount : 19
     * source : 新民晚报
     * subtitle :
     * title : 上海一司机开车撞倒行人后又连撞3车 行人不幸身亡
     * url : http://3g.163.com/news/18/0818/15/DPGJ5CPS0001875P.html
     * url_3w : http://news.163.com/18/0818/15/DPGJ5CPS0001875P.html
     * votecount : 11
     */

    private String boardid;
    private String daynum;
    private String digest;
    private String docid;
    private String imgsrc;
    private String lmodify;
    private String ltitle;
    private String mtime;
    private String postid;
    private int priority;
    private String ptime;
    private int replyCount;
    private String source;
    private String subtitle;
    private String title;
    private String url;
    private String url_3w;
    private int votecount;

    protected NewsDetail(Parcel in) {
        boardid = in.readString();
        daynum = in.readString();
        digest = in.readString();
        docid = in.readString();
        imgsrc = in.readString();
        lmodify = in.readString();
        ltitle = in.readString();
        mtime = in.readString();
        postid = in.readString();
        priority = in.readInt();
        ptime = in.readString();
        replyCount = in.readInt();
        source = in.readString();
        subtitle = in.readString();
        title = in.readString();
        url = in.readString();
        url_3w = in.readString();
        votecount = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(boardid);
        dest.writeString(daynum);
        dest.writeString(digest);
        dest.writeString(docid);
        dest.writeString(imgsrc);
        dest.writeString(lmodify);
        dest.writeString(ltitle);
        dest.writeString(mtime);
        dest.writeString(postid);
        dest.writeInt(priority);
        dest.writeString(ptime);
        dest.writeInt(replyCount);
        dest.writeString(source);
        dest.writeString(subtitle);
        dest.writeString(title);
        dest.writeString(url);
        dest.writeString(url_3w);
        dest.writeInt(votecount);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<NewsDetail> CREATOR = new Creator<NewsDetail>() {
        @Override
        public NewsDetail createFromParcel(Parcel in) {
            return new NewsDetail(in);
        }

        @Override
        public NewsDetail[] newArray(int size) {
            return new NewsDetail[size];
        }
    };

    public String getBoardid() {
        return boardid;
    }

    public void setBoardid(String boardid) {
        this.boardid = boardid;
    }

    public String getDaynum() {
        return daynum;
    }

    public void setDaynum(String daynum) {
        this.daynum = daynum;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getLmodify() {
        return lmodify;
    }

    public void setLmodify(String lmodify) {
        this.lmodify = lmodify;
    }

    public String getLtitle() {
        return ltitle;
    }

    public void setLtitle(String ltitle) {
        this.ltitle = ltitle;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_3w() {
        return url_3w;
    }

    public void setUrl_3w(String url_3w) {
        this.url_3w = url_3w;
    }

    public int getVotecount() {
        return votecount;
    }

    public void setVotecount(int votecount) {
        this.votecount = votecount;
    }
}
