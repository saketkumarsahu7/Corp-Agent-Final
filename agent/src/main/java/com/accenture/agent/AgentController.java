package com.accenture.agent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AgentController {

    private final Map<String, String> knowledgeBase = new HashMap<>();

    public AgentController() {
        loadMegaKnowledgeBase();
    }

    private void loadMegaKnowledgeBase() {
        // =================================================================================
        // 1. JOB ROLE & TECHNICAL SKILLS (Deep Dive)
        // =================================================================================
        knowledgeBase.put("ceo", "Julie Sweet is the Chair and CEO of Accenture.");knowledgeBase.put("role", "Advanced Application Engineer (Level 11). You are an 'AI-native' engineer building agentic systems, not just standard apps.");
        knowledgeBase.put("skills", "Required: Java/Python, GenAI/LLM exposure, and Cloud (AWS/Azure). Bonus: Experience with vector databases and semantic retrieval.");
        knowledgeBase.put("tools", "You will use: GitHub Copilot, AutoGen, LangChain, CrewAI, and proprietary tools like AI Refinery.");
        knowledgeBase.put("slm", "Small Language Models (SLMs): Domain-specific models trained for niche tasks (e.g., legal or banking) that are faster/cheaper than GPT-4.");
        knowledgeBase.put("agentic", "Agentic AI: Systems that can 'do' things (actions) rather than just 'say' things. Example: An agent that detects a server crash and restarts it automatically.");
        knowledgeBase.put("collaboration", "You work with: Cognitive Architects (who design the mind of the AI), Data Scientists, and Domain Experts.");
        knowledgeBase.put("workflow", "Your goal is to reimagine legacy workflows. Instead of humans processing forms, you build AI agents to read, validate, and approve them instantly.");

        // =================================================================================
        // 2. RECRUITMENT & ASSESSMENT LOGISTICS
        // =================================================================================
        knowledgeBase.put("pan", "Mandatory: Original PAN card with photo. Name must match offer letter. Minor PANs are rejected.");
        knowledgeBase.put("seb", "Software: Safe Exam Browser (SEB) is mandatory. Uninstall old versions. Disable VPNs and Proxies.");
        knowledgeBase.put("environment", "Test Rules: Room must be well-lit. No other people allowed. No talking. Face must be visible to the webcam at all times.");
        knowledgeBase.put("hardware", "Laptop: Working Webcam + Mic required. 4GB+ RAM. Avoid Bluetooth headsets (use USB/Wired).");
        knowledgeBase.put("internet", "Network: Stable 2Mbps+ broadband. Do not use mobile hotspots (4G/5G) as they are unstable for SEB.");
        knowledgeBase.put("fraud", "Alert: Accenture NEVER asks for money. Recruitment is merit-only. Report scams to businessethicsline.com/accenture.");
        knowledgeBase.put("support", "Helpdesk: Call +91 6366524235 for technical glitches during the exam.");

        // =================================================================================
        // 3. CORPORATE PROFILE & HISTORY
        // =================================================================================
        knowledgeBase.put("history", "Origins: Started as Arthur Andersen's consulting unit (1950s). Split in 1989. Fully independent in 2000 via arbitration.");
        knowledgeBase.put("name", "Name: 'Accenture' = 'Accent on the future'. Coined by employee Kim Petersen in 2000.");
        knowledgeBase.put("headquarters", "HQ: Dublin, Ireland (since 2009). Previous Domicile: Bermuda (2001-2009).");
        knowledgeBase.put("ticker", "Stock: NYSE: ACN. IPO Date: July 19, 2001. IPO Price: $14.50.");
        knowledgeBase.put("employees", "Workforce: ~733,000 employees globally. We are a 'Talent-Led' organization.");
        knowledgeBase.put("clients", "Reach: We serve 91 of the Fortune Global 100. Operations in 120+ countries.");

        // =================================================================================
        // 4. FINANCIALS & STRATEGY
        // =================================================================================
        knowledgeBase.put("revenue", "FY24 Revenue: $64.9 Billion. Strong growth in Managed Services.");
        knowledgeBase.put("bookings", "FY24 Bookings: $81.2 Billion. Book-to-Bill Ratio: 1.3 (Indicating high future demand).");
        knowledgeBase.put("investment", "GenAI: We are investing $3 Billion over 3 years in Data & AI. Goal: Double AI talent to 80,000.");
        knowledgeBase.put("acquisitions", "Growth Strategy: We acquire companies aggressively. Examples: Droga5 (Creative), Udacity (EdTech), Linkbynet (Cloud).");
        knowledgeBase.put("dividends", "Returns: We pay quarterly dividends. FY24 dividend increased by 15% to $1.29/share.");
        knowledgeBase.put("margin", "Profitability: Adjusted Operating Margin ~15.5%. Focus is on '360-degree value'.");

        // =================================================================================
        // 5. SERVICE LINES (THE 5 PILLARS)
        // =================================================================================
        knowledgeBase.put("strategy", "Strategy & Consulting: The 'Brain'. We advise CEOs on transformation and then execute it.");
        knowledgeBase.put("technology", "Technology: The 'Backbone'. Largest independent tech provider. Deep partnerships with SAP, Oracle, Microsoft, AWS, Google.");
        knowledgeBase.put("operations", "Operations: The 'Engine'. We run business processes (HR, Finance, Marketing) for clients using SynOps.");
        knowledgeBase.put("industry x", "Industry X: The 'Factory'. Digitizing manufacturing with IoT, Digital Twins, and Embedded Software (OT + IT).");
        knowledgeBase.put("song", "Accenture Song: The 'Experience'. Formerly 'Interactive'. World's largest tech-powered creative group.");

        // =================================================================================
        // 6. PROPRIETARY PLATFORMS (INTELLECTUAL PROPERTY)
        // =================================================================================
        knowledgeBase.put("synops", "SynOps: Human-Machine Operating Engine. Orchestrates work between AI bots and humans for Operations.");
        knowledgeBase.put("mynav", "myNav: Cloud Navigator. Simulates cloud architectures. Includes 'Green Cloud Advisor' for carbon reduction.");
        knowledgeBase.put("refinery", "AI Refinery: GenAI platform built on NVIDIA stack. Allows clients to fine-tune LLMs on private data securely.");
        knowledgeBase.put("huddle", "Trusted Agent Huddle: Middleware using Agent2Agent (A2A) protocol to let disparate AI agents collaborate.");
        knowledgeBase.put("genwizard", "GenWizard: Automation platform for software engineering. Uses GenAI to modernize legacy code automatically.");
        knowledgeBase.put("metaverse", "Nth Floor: Our enterprise metaverse. Used for onboarding new joiners and virtual collaboration.");

        // =================================================================================
        // 7. HR POLICIES & BENEFITS (INDIA SPECIFIC)
        // =================================================================================
        knowledgeBase.put("rto", "Work Model: Strict Hybrid. Generally 2-3 days in office/week. Swipe data tracked for compliance.");
        knowledgeBase.put("leave", "Leaves: ~24 Earned Leaves (EL) + 10 Casual Leaves (CL). 'Two-Day Rule': CL > 2 days needs approval.");
        knowledgeBase.put("medical", "Insurance: Comprehensive Medical Insurance provided for Self + Dependents (Spouse/Children/Parents).");
        knowledgeBase.put("transport", "Cabs: Provided for shifts between 8:00 PM and 6:00 AM. Ensuring safety for night shift employees.");
        knowledgeBase.put("dress", "Dress Code: Business Casual (Mon-Thu). Smart Casual (Fri). Formal wear required for client meetings.");
        knowledgeBase.put("promotion", "Cycle: India promotion cycle has moved to June (permanently) to align with fiscal demand visibility.");
        knowledgeBase.put("tier 2", "Locations: Expanded to Jaipur, Coimbatore, Indore, Bhubaneswar (Near-shore delivery centers).");
        knowledgeBase.put("tq", "Training: 'TQ' (Technology Quotient) is mandatory. Topics: Cloud, AI, Agile, Security.");

        // =================================================================================
        // 8. SUSTAINABILITY & VALUES
        // =================================================================================
        knowledgeBase.put("net zero", "Environment: Committed to Net-Zero emissions by 2025. 100% Renewable Electricity in offices.");
        knowledgeBase.put("inclusion", "Diversity: #1 on Refinitiv D&I Index. Goal: 50/50 gender parity by 2025. 48% women workforce currently.");
        knowledgeBase.put("values", "Core Values: 1. Client Value Creation 2. One Global Network 3. Respect for the Individual 4. Best People 5. Integrity 6. Stewardship.");
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/ask-agent")
    @ResponseBody
    public Map<String, String> askAgent(@RequestParam("query") String query) {
        String processedQuery = query.toLowerCase();

        // Priority Keyword Matching
        // The order doesn't strictly matter in a HashMap, but the logic finds ANY match.
        for (Map.Entry<String, String> entry : knowledgeBase.entrySet()) {
            if (processedQuery.contains(entry.getKey())) {
                return Map.of("answer", "<strong>Agent Response:</strong> " + entry.getValue());
            }
        }

        // Intelligent Fallback
        return Map.of("answer", "<strong>Agent Response:</strong> I am the Mega-Knowledge Accenture Agent. I can discuss:<br>" +
                "• <strong>Deep Tech:</strong> (LangChain, AutoGen, SynOps)<br>" +
                "• <strong>HR Logistics:</strong> (Cabs, Dress Code, Insurance)<br>" +
                "• <strong>Recruitment:</strong> (PAN rules, SEB setup)<br>" +
                "• <strong>Strategy:</strong> ($3B Investment, Industry X)<br>" +
                "<i>Try asking: 'Do you provide cabs?', 'What tools will I use?', or 'Explain Industry X'.</i>");
    }
}