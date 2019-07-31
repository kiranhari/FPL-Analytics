package com.kiran.fanatasyPremierLeageue.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="Players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public  class PlayerList {
	
	
	@Id String _id;
	String photo;
	String web_name;
	String team_code;
	String status;
	String code;
	String first_name;
	String second_name;
	String squad_number;
	String news;
	Double now_cost;
	String news_added;
	Double chance_of_playing_this_round;
	Double chance_of_playing_next_round;
	Double value_form;
	Double value_season;
	Double cost_change_start;
	Double cost_change_event;
	Double cost_change_start_fall;
	Double cost_change_event_fall;
	String in_dreamteam;
	String dreamteam_count;
	Double selected_by_percent;
	Double form;
	Double transfers_out;
	Double transfers_in;
	Double transfers_out_event;
	Double transfers_in_event;
	Double loans_in;
	Double loans_out;
	Double loaned_in;
	Double loaned_out;
	Double total_points;
	Double event_points;
	Double points_per_game;
	String ep_this;
	String ep_next;
	String special;
	Double minutes;
	int goals_scored;
	int assists;
	int clean_sheets;
	int goals_conceded;
	int own_goals;
	int penalties_saved;
	int penalties_missed;
	int yellow_cards;
	int red_cards;
	int saves;
	int bonus;
	int bps;
	String influence;
	String creativity;
	String threat;
	Double ict_index;
	Double ea_index;
	int element_type;
	int team;
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the web_name
	 */
	public String getWeb_name() {
		return web_name;
	}
	/**
	 * @param web_name the web_name to set
	 */
	public void setWeb_name(String web_name) {
		this.web_name = web_name;
	}
	/**
	 * @return the team_code
	 */
	public String getTeam_code() {
		return team_code;
	}
	/**
	 * @param team_code the team_code to set
	 */
	public void setTeam_code(String team_code) {
		this.team_code = team_code;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the second_name
	 */
	public String getSecond_name() {
		return second_name;
	}
	/**
	 * @param second_name the second_name to set
	 */
	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	/**
	 * @return the squad_number
	 */
	public String getSquad_number() {
		return squad_number;
	}
	/**
	 * @param squad_number the squad_number to set
	 */
	public void setSquad_number(String squad_number) {
		this.squad_number = squad_number;
	}
	/**
	 * @return the news
	 */
	public String getNews() {
		return news;
	}
	/**
	 * @param news the news to set
	 */
	public void setNews(String news) {
		this.news = news;
	}
	/**
	 * @return the now_cost
	 */
	public Double getNow_cost() {
		return now_cost;
	}
	/**
	 * @param now_cost the now_cost to set
	 */
	public void setNow_cost(Double now_cost) {
		this.now_cost = now_cost;
	}
	/**
	 * @return the news_added
	 */
	public String getNews_added() {
		return news_added;
	}
	/**
	 * @param news_added the news_added to set
	 */
	public void setNews_added(String news_added) {
		this.news_added = news_added;
	}
	/**
	 * @return the chance_of_playing_this_round
	 */
	public Double getChance_of_playing_this_round() {
		return chance_of_playing_this_round;
	}
	/**
	 * @param chance_of_playing_this_round the chance_of_playing_this_round to set
	 */
	public void setChance_of_playing_this_round(Double chance_of_playing_this_round) {
		this.chance_of_playing_this_round = chance_of_playing_this_round;
	}
	/**
	 * @return the chance_of_playing_next_round
	 */
	public Double getChance_of_playing_next_round() {
		return chance_of_playing_next_round;
	}
	/**
	 * @param chance_of_playing_next_round the chance_of_playing_next_round to set
	 */
	public void setChance_of_playing_next_round(Double chance_of_playing_next_round) {
		this.chance_of_playing_next_round = chance_of_playing_next_round;
	}
	/**
	 * @return the value_form
	 */
	public Double getValue_form() {
		return value_form;
	}
	/**
	 * @param value_form the value_form to set
	 */
	public void setValue_form(Double value_form) {
		this.value_form = value_form;
	}
	/**
	 * @return the value_season
	 */
	public Double getValue_season() {
		return value_season;
	}
	/**
	 * @param value_season the value_season to set
	 */
	public void setValue_season(Double value_season) {
		this.value_season = value_season;
	}
	/**
	 * @return the cost_change_start
	 */
	public Double getCost_change_start() {
		return cost_change_start;
	}
	/**
	 * @param cost_change_start the cost_change_start to set
	 */
	public void setCost_change_start(Double cost_change_start) {
		this.cost_change_start = cost_change_start;
	}
	/**
	 * @return the cost_change_event
	 */
	public Double getCost_change_event() {
		return cost_change_event;
	}
	/**
	 * @param cost_change_event the cost_change_event to set
	 */
	public void setCost_change_event(Double cost_change_event) {
		this.cost_change_event = cost_change_event;
	}
	/**
	 * @return the cost_change_start_fall
	 */
	public Double getCost_change_start_fall() {
		return cost_change_start_fall;
	}
	/**
	 * @param cost_change_start_fall the cost_change_start_fall to set
	 */
	public void setCost_change_start_fall(Double cost_change_start_fall) {
		this.cost_change_start_fall = cost_change_start_fall;
	}
	/**
	 * @return the cost_change_event_fall
	 */
	public Double getCost_change_event_fall() {
		return cost_change_event_fall;
	}
	/**
	 * @param cost_change_event_fall the cost_change_event_fall to set
	 */
	public void setCost_change_event_fall(Double cost_change_event_fall) {
		this.cost_change_event_fall = cost_change_event_fall;
	}
	/**
	 * @return the in_dreamteam
	 */
	public String getIn_dreamteam() {
		return in_dreamteam;
	}
	/**
	 * @param in_dreamteam the in_dreamteam to set
	 */
	public void setIn_dreamteam(String in_dreamteam) {
		this.in_dreamteam = in_dreamteam;
	}
	/**
	 * @return the dreamteam_count
	 */
	public String getDreamteam_count() {
		return dreamteam_count;
	}
	/**
	 * @param dreamteam_count the dreamteam_count to set
	 */
	public void setDreamteam_count(String dreamteam_count) {
		this.dreamteam_count = dreamteam_count;
	}
	/**
	 * @return the selected_by_percent
	 */
	public Double getSelected_by_percent() {
		return selected_by_percent;
	}
	/**
	 * @param selected_by_percent the selected_by_percent to set
	 */
	public void setSelected_by_percent(Double selected_by_percent) {
		this.selected_by_percent = selected_by_percent;
	}
	/**
	 * @return the form
	 */
	public Double getForm() {
		return form;
	}
	/**
	 * @param form the form to set
	 */
	public void setForm(Double form) {
		this.form = form;
	}
	/**
	 * @return the transfers_out
	 */
	public Double getTransfers_out() {
		return transfers_out;
	}
	/**
	 * @param transfers_out the transfers_out to set
	 */
	public void setTransfers_out(Double transfers_out) {
		this.transfers_out = transfers_out;
	}
	/**
	 * @return the transfers_in
	 */
	public Double getTransfers_in() {
		return transfers_in;
	}
	/**
	 * @param transfers_in the transfers_in to set
	 */
	public void setTransfers_in(Double transfers_in) {
		this.transfers_in = transfers_in;
	}
	/**
	 * @return the transfers_out_event
	 */
	public Double getTransfers_out_event() {
		return transfers_out_event;
	}
	/**
	 * @param transfers_out_event the transfers_out_event to set
	 */
	public void setTransfers_out_event(Double transfers_out_event) {
		this.transfers_out_event = transfers_out_event;
	}
	/**
	 * @return the transfers_in_event
	 */
	public Double getTransfers_in_event() {
		return transfers_in_event;
	}
	/**
	 * @param transfers_in_event the transfers_in_event to set
	 */
	public void setTransfers_in_event(Double transfers_in_event) {
		this.transfers_in_event = transfers_in_event;
	}
	/**
	 * @return the loans_in
	 */
	public Double getLoans_in() {
		return loans_in;
	}
	/**
	 * @param loans_in the loans_in to set
	 */
	public void setLoans_in(Double loans_in) {
		this.loans_in = loans_in;
	}
	/**
	 * @return the loans_out
	 */
	public Double getLoans_out() {
		return loans_out;
	}
	/**
	 * @param loans_out the loans_out to set
	 */
	public void setLoans_out(Double loans_out) {
		this.loans_out = loans_out;
	}
	/**
	 * @return the loaned_in
	 */
	public Double getLoaned_in() {
		return loaned_in;
	}
	/**
	 * @param loaned_in the loaned_in to set
	 */
	public void setLoaned_in(Double loaned_in) {
		this.loaned_in = loaned_in;
	}
	/**
	 * @return the loaned_out
	 */
	public Double getLoaned_out() {
		return loaned_out;
	}
	/**
	 * @param loaned_out the loaned_out to set
	 */
	public void setLoaned_out(Double loaned_out) {
		this.loaned_out = loaned_out;
	}
	/**
	 * @return the total_points
	 */
	public Double getTotal_points() {
		return total_points;
	}
	/**
	 * @param total_points the total_points to set
	 */
	public void setTotal_points(Double total_points) {
		this.total_points = total_points;
	}
	/**
	 * @return the event_points
	 */
	public Double getEvent_points() {
		return event_points;
	}
	/**
	 * @param event_points the event_points to set
	 */
	public void setEvent_points(Double event_points) {
		this.event_points = event_points;
	}
	/**
	 * @return the points_per_game
	 */
	public Double getPoints_per_game() {
		return points_per_game;
	}
	/**
	 * @param points_per_game the points_per_game to set
	 */
	public void setPoints_per_game(Double points_per_game) {
		this.points_per_game = points_per_game;
	}
	/**
	 * @return the ep_this
	 */
	public String getEp_this() {
		return ep_this;
	}
	/**
	 * @param ep_this the ep_this to set
	 */
	public void setEp_this(String ep_this) {
		this.ep_this = ep_this;
	}
	/**
	 * @return the ep_next
	 */
	public String getEp_next() {
		return ep_next;
	}
	/**
	 * @param ep_next the ep_next to set
	 */
	public void setEp_next(String ep_next) {
		this.ep_next = ep_next;
	}
	/**
	 * @return the special
	 */
	public String getSpecial() {
		return special;
	}
	/**
	 * @param special the special to set
	 */
	public void setSpecial(String special) {
		this.special = special;
	}
	/**
	 * @return the minutes
	 */
	public Double getMinutes() {
		return minutes;
	}
	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(Double minutes) {
		this.minutes = minutes;
	}
	/**
	 * @return the goals_scored
	 */
	public int getGoals_scored() {
		return goals_scored;
	}
	/**
	 * @param goals_scored the goals_scored to set
	 */
	public void setGoals_scored(int goals_scored) {
		this.goals_scored = goals_scored;
	}
	/**
	 * @return the assists
	 */
	public int getAssists() {
		return assists;
	}
	/**
	 * @param assists the assists to set
	 */
	public void setAssists(int assists) {
		this.assists = assists;
	}
	/**
	 * @return the clean_sheets
	 */
	public int getClean_sheets() {
		return clean_sheets;
	}
	/**
	 * @param clean_sheets the clean_sheets to set
	 */
	public void setClean_sheets(int clean_sheets) {
		this.clean_sheets = clean_sheets;
	}
	/**
	 * @return the goals_conceded
	 */
	public int getGoals_conceded() {
		return goals_conceded;
	}
	/**
	 * @param goals_conceded the goals_conceded to set
	 */
	public void setGoals_conceded(int goals_conceded) {
		this.goals_conceded = goals_conceded;
	}
	/**
	 * @return the own_goals
	 */
	public int getOwn_goals() {
		return own_goals;
	}
	/**
	 * @param own_goals the own_goals to set
	 */
	public void setOwn_goals(int own_goals) {
		this.own_goals = own_goals;
	}
	/**
	 * @return the penalties_saved
	 */
	public int getPenalties_saved() {
		return penalties_saved;
	}
	/**
	 * @param penalties_saved the penalties_saved to set
	 */
	public void setPenalties_saved(int penalties_saved) {
		this.penalties_saved = penalties_saved;
	}
	/**
	 * @return the penalties_missed
	 */
	public int getPenalties_missed() {
		return penalties_missed;
	}
	/**
	 * @param penalties_missed the penalties_missed to set
	 */
	public void setPenalties_missed(int penalties_missed) {
		this.penalties_missed = penalties_missed;
	}
	/**
	 * @return the yellow_cards
	 */
	public int getYellow_cards() {
		return yellow_cards;
	}
	/**
	 * @param yellow_cards the yellow_cards to set
	 */
	public void setYellow_cards(int yellow_cards) {
		this.yellow_cards = yellow_cards;
	}
	/**
	 * @return the red_cards
	 */
	public int getRed_cards() {
		return red_cards;
	}
	/**
	 * @param red_cards the red_cards to set
	 */
	public void setRed_cards(int red_cards) {
		this.red_cards = red_cards;
	}
	/**
	 * @return the saves
	 */
	public int getSaves() {
		return saves;
	}
	/**
	 * @param saves the saves to set
	 */
	public void setSaves(int saves) {
		this.saves = saves;
	}
	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	/**
	 * @return the bps
	 */
	public int getBps() {
		return bps;
	}
	/**
	 * @param bps the bps to set
	 */
	public void setBps(int bps) {
		this.bps = bps;
	}
	/**
	 * @return the influence
	 */
	public String getInfluence() {
		return influence;
	}
	/**
	 * @param influence the influence to set
	 */
	public void setInfluence(String influence) {
		this.influence = influence;
	}
	/**
	 * @return the creativity
	 */
	public String getCreativity() {
		return creativity;
	}
	/**
	 * @param creativity the creativity to set
	 */
	public void setCreativity(String creativity) {
		this.creativity = creativity;
	}
	/**
	 * @return the threat
	 */
	public String getThreat() {
		return threat;
	}
	/**
	 * @param threat the threat to set
	 */
	public void setThreat(String threat) {
		this.threat = threat;
	}
	/**
	 * @return the ict_index
	 */
	public double getIct_index() {
		return ict_index;
	}
	/**
	 * @param ict_index the ict_index to set
	 */
	public void setIct_index(double ict_index) {
		this.ict_index = ict_index;
	}
	/**
	 * @return the ea_index
	 */
	public double getEa_index() {
		return ea_index;
	}
	/**
	 * @param ea_index the ea_index to set
	 */
	public void setEa_index(double ea_index) {
		this.ea_index = ea_index;
	}
	/**
	 * @return the element_type
	 */
	public int getElement_type() {
		return element_type;
	}
	/**
	 * @param element_type the element_type to set
	 */
	public void setElement_type(int element_type) {
		this.element_type = element_type;
	}
	/**
	 * @return the team
	 */
	public int getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(int team) {
		this.team = team;
	}
	
	

	
	
}
