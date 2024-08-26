# Working with googleAdNetwork Connector

## Overview

| Operation        | Description |
| ------------- |-------------|
| [audienceInsights.listInsightsEligibleDates](#audience-insights-list-insights-eligible-dates)| This is audienceInsights.listInsightsEligibleDates operation. |
| [customers.AdGroupCriterionCustomizers.mutate](#customers-ad-group-criterion-customizers-mutate)| This is customers.AdGroupCriterionCustomizers.mutate operation. |
| [customers.CustomerCustomizers.mutate](#customers-customer-customizers-mutate)| This is customers.CustomerCustomizers.mutate operation. |
| [customers.accountBudgetProposals.mutate](#customers-account-budget-proposals-mutate)| This is customers.accountBudgetProposals.mutate operation. |
| [customers.accountLinks.create](#customers-account-links-create)| This is customers.accountLinks.create operation. |
| [customers.accountLinks.mutate](#customers-account-links-mutate)| This is customers.accountLinks.mutate operation. |
| [customers.adGroupAdLabels.mutate](#customers-ad-group-ad-labels-mutate)| This is customers.adGroupAdLabels.mutate operation. |
| [customers.adGroupAds.mutate](#customers-ad-group-ads-mutate)| This is customers.adGroupAds.mutate operation. |
| [customers.adGroupAds.removeAutomaticallyCreatedAssets](#customers-ad-group-ads-remove-automatically-created-assets)| This is customers.adGroupAds.removeAutomaticallyCreatedAssets operation. |
| [customers.adGroupAssetSets.mutate](#customers-ad-group-asset-sets-mutate)| This is customers.adGroupAssetSets.mutate operation. |
| [customers.adGroupAssets.mutate](#customers-ad-group-assets-mutate)| This is customers.adGroupAssets.mutate operation. |
| [customers.adGroupBidModifiers.mutate](#customers-ad-group-bid-modifiers-mutate)| This is customers.adGroupBidModifiers.mutate operation. |
| [customers.adGroupCriteria.mutate](#customers-ad-group-criteria-mutate)| This is customers.adGroupCriteria.mutate operation. |
| [customers.adGroupCriterionLabels.mutate](#customers-ad-group-criterion-labels-mutate)| This is customers.adGroupCriterionLabels.mutate operation. |
| [customers.adGroupCustomizers.mutate](#customers-ad-group-customizers-mutate)| This is customers.adGroupCustomizers.mutate operation. |
| [customers.adGroupExtensionSettings.mutate](#customers-ad-group-extension-settings-mutate)| This is customers.adGroupExtensionSettings.mutate operation. |
| [customers.adGroupFeeds.mutate](#customers-ad-group-feeds-mutate)| This is customers.adGroupFeeds.mutate operation. |
| [customers.adGroupLabels.mutate](#customers-ad-group-labels-mutate)| This is customers.adGroupLabels.mutate operation. |
| [customers.adGroups.mutate](#customers-ad-groups-mutate)| This is customers.adGroups.mutate operation. |
| [customers.adParameters.mutate](#customers-ad-parameters-mutate)| This is customers.adParameters.mutate operation. |
| [customers.ads.mutate](#customers-ads-mutate)| This is customers.ads.mutate operation. |
| [customers.assetGroupAssets.mutate](#customers-asset-group-assets-mutate)| This is customers.assetGroupAssets.mutate operation. |
| [customers.assetGroupListingGroupFilters.mutate](#customers-asset-group-listing-group-filters-mutate)| This is customers.assetGroupListingGroupFilters.mutate operation. |
| [customers.assetGroupSignals.mutate](#customers-asset-group-signals-mutate)| This is customers.assetGroupSignals.mutate operation. |
| [customers.assetGroups.mutate](#customers-asset-groups-mutate)| This is customers.assetGroups.mutate operation. |
| [customers.assetSetAssets.mutate](#customers-asset-set-assets-mutate)| This is customers.assetSetAssets.mutate operation. |
| [customers.assetSets.mutate](#customers-asset-sets-mutate)| This is customers.assetSets.mutate operation. |
| [customers.assets.mutate](#customers-assets-mutate)| This is customers.assets.mutate operation. |
| [customers.audiences.mutate](#customers-audiences-mutate)| This is customers.audiences.mutate operation. |
| [customers.batchJobs.addOperations](#customers-batch-jobs-add-operations)| This is customers.batchJobs.addOperations operation. |
| [customers.batchJobs.listResults](#customers-batch-jobs-list-results)| This is customers.batchJobs.listResults operation. |
| [customers.batchJobs.mutate](#customers-batch-jobs-mutate)| This is customers.batchJobs.mutate operation. |
| [customers.batchJobs.run](#customers-batch-jobs-run)| This is customers.batchJobs.run operation. |
| [customers.biddingDataExclusions.mutate](#customers-bidding-data-exclusions-mutate)| This is customers.biddingDataExclusions.mutate operation. |
| [customers.biddingSeasonalityAdjustments.mutate](#customers-bidding-seasonality-adjustments-mutate)| This is customers.biddingSeasonalityAdjustments.mutate operation. |
| [customers.biddingStrategies.mutate](#customers-bidding-strategies-mutate)| This is customers.biddingStrategies.mutate operation. |
| [customers.billingSetups.mutate](#customers-billing-setups-mutate)| This is customers.billingSetups.mutate operation. |
| [customers.campaignAssetSets.mutate](#customers-campaign-asset-sets-mutate)| This is customers.campaignAssetSets.mutate operation. |
| [customers.campaignAssets.mutate](#customers-campaign-assets-mutate)| This is customers.campaignAssets.mutate operation. |
| [customers.campaignBidModifiers.mutate](#customers-campaign-bid-modifiers-mutate)| This is customers.campaignBidModifiers.mutate operation. |
| [customers.campaignBudgets.mutate](#customers-campaign-budgets-mutate)| This is customers.campaignBudgets.mutate operation. |
| [customers.campaignConversionGoals.mutate](#customers-campaign-conversion-goals-mutate)| This is customers.campaignConversionGoals.mutate operation. |
| [customers.campaignCriteria.mutate](#customers-campaign-criteria-mutate)| This is customers.campaignCriteria.mutate operation. |
| [customers.campaignCustomizers.mutate](#customers-campaign-customizers-mutate)| This is customers.campaignCustomizers.mutate operation. |
| [customers.campaignDrafts.listAsyncErrors](#customers-campaign-drafts-list-async-errors)| This is customers.campaignDrafts.listAsyncErrors operation. |
| [customers.campaignDrafts.mutate](#customers-campaign-drafts-mutate)| This is customers.campaignDrafts.mutate operation. |
| [customers.campaignDrafts.promote](#customers-campaign-drafts-promote)| This is customers.campaignDrafts.promote operation. |
| [customers.campaignExtensionSettings.mutate](#customers-campaign-extension-settings-mutate)| This is customers.campaignExtensionSettings.mutate operation. |
| [customers.campaignFeeds.mutate](#customers-campaign-feeds-mutate)| This is customers.campaignFeeds.mutate operation. |
| [customers.campaignGroups.mutate](#customers-campaign-groups-mutate)| This is customers.campaignGroups.mutate operation. |
| [customers.campaignLabels.mutate](#customers-campaign-labels-mutate)| This is customers.campaignLabels.mutate operation. |
| [customers.campaignLifecycleGoal.configureCampaignLifecycleGoals](#customers-campaign-lifecycle-goal-configure-campaign-lifecycle-goals)| This is customers.campaignLifecycleGoal.configureCampaignLifecycleGoals operation. |
| [customers.campaignSharedSets.mutate](#customers-campaign-shared-sets-mutate)| This is customers.campaignSharedSets.mutate operation. |
| [customers.campaigns.mutate](#customers-campaigns-mutate)| This is customers.campaigns.mutate operation. |
| [customers.conversionActions.mutate](#customers-conversion-actions-mutate)| This is customers.conversionActions.mutate operation. |
| [customers.conversionCustomVariables.mutate](#customers-conversion-custom-variables-mutate)| This is customers.conversionCustomVariables.mutate operation. |
| [customers.conversionGoalCampaignConfigs.mutate](#customers-conversion-goal-campaign-configs-mutate)| This is customers.conversionGoalCampaignConfigs.mutate operation. |
| [customers.conversionValueRuleSets.mutate](#customers-conversion-value-rule-sets-mutate)| This is customers.conversionValueRuleSets.mutate operation. |
| [customers.conversionValueRules.mutate](#customers-conversion-value-rules-mutate)| This is customers.conversionValueRules.mutate operation. |
| [customers.createCustomerClient](#customers-create-customer-client)| This is customers.createCustomerClient operation. |
| [customers.customAudiences.mutate](#customers-custom-audiences-mutate)| This is customers.customAudiences.mutate operation. |
| [customers.customConversionGoals.mutate](#customers-custom-conversion-goals-mutate)| This is customers.customConversionGoals.mutate operation. |
| [customers.customInterests.mutate](#customers-custom-interests-mutate)| This is customers.customInterests.mutate operation. |
| [customers.customerAssetSets.mutate](#customers-customer-asset-sets-mutate)| This is customers.customerAssetSets.mutate operation. |
| [customers.customerAssets.mutate](#customers-customer-assets-mutate)| This is customers.customerAssets.mutate operation. |
| [customers.customerClientLinks.mutate](#customers-customer-client-links-mutate)| This is customers.customerClientLinks.mutate operation. |
| [customers.customerConversionGoals.mutate](#customers-customer-conversion-goals-mutate)| This is customers.customerConversionGoals.mutate operation. |
| [customers.customerExtensionSettings.mutate](#customers-customer-extension-settings-mutate)| This is customers.customerExtensionSettings.mutate operation. |
| [customers.customerFeeds.mutate](#customers-customer-feeds-mutate)| This is customers.customerFeeds.mutate operation. |
| [customers.customerLabels.mutate](#customers-customer-labels-mutate)| This is customers.customerLabels.mutate operation. |
| [customers.customerLifecycleGoal.configureCustomerLifecycleGoals](#customers-customer-lifecycle-goal-configure-customer-lifecycle-goals)| This is customers.customerLifecycleGoal.configureCustomerLifecycleGoals operation. |
| [customers.customerManagerLinks.moveManagerLink](#customers-customer-manager-links-move-manager-link)| This is customers.customerManagerLinks.moveManagerLink operation. |
| [customers.customerManagerLinks.mutate](#customers-customer-manager-links-mutate)| This is customers.customerManagerLinks.mutate operation. |
| [customers.customerNegativeCriteria.mutate](#customers-customer-negative-criteria-mutate)| This is customers.customerNegativeCriteria.mutate operation. |
| [customers.customerSkAdNetworkConversionValueSchemas.mutate](#customers-customer-sk-ad-network-conversion-value-schemas-mutate)| This is customers.customerSkAdNetworkConversionValueSchemas.mutate operation. |
| [customers.customerUserAccessInvitations.mutate](#customers-customer-user-access-invitations-mutate)| This is customers.customerUserAccessInvitations.mutate operation. |
| [customers.customerUserAccesses.mutate](#customers-customer-user-accesses-mutate)| This is customers.customerUserAccesses.mutate operation. |
| [customers.customizerAttributes.mutate](#customers-customizer-attributes-mutate)| This is customers.customizerAttributes.mutate operation. |
| [customers.experimentArms.mutate](#customers-experiment-arms-mutate)| This is customers.experimentArms.mutate operation. |
| [customers.experiments.endExperiment](#customers-experiments-end-experiment)| This is customers.experiments.endExperiment operation. |
| [customers.experiments.graduateExperiment](#customers-experiments-graduate-experiment)| This is customers.experiments.graduateExperiment operation. |
| [customers.experiments.listExperimentAsyncErrors](#customers-experiments-list-experiment-async-errors)| This is customers.experiments.listExperimentAsyncErrors operation. |
| [customers.experiments.mutate](#customers-experiments-mutate)| This is customers.experiments.mutate operation. |
| [customers.experiments.promoteExperiment](#customers-experiments-promote-experiment)| This is customers.experiments.promoteExperiment operation. |
| [customers.experiments.scheduleExperiment](#customers-experiments-schedule-experiment)| This is customers.experiments.scheduleExperiment operation. |
| [customers.extensionFeedItems.mutate](#customers-extension-feed-items-mutate)| This is customers.extensionFeedItems.mutate operation. |
| [customers.feedItemSetLinks.mutate](#customers-feed-item-set-links-mutate)| This is customers.feedItemSetLinks.mutate operation. |
| [customers.feedItemSets.mutate](#customers-feed-item-sets-mutate)| This is customers.feedItemSets.mutate operation. |
| [customers.feedItemTargets.mutate](#customers-feed-item-targets-mutate)| This is customers.feedItemTargets.mutate operation. |
| [customers.feedItems.mutate](#customers-feed-items-mutate)| This is customers.feedItems.mutate operation. |
| [customers.feedMappings.mutate](#customers-feed-mappings-mutate)| This is customers.feedMappings.mutate operation. |
| [customers.feeds.mutate](#customers-feeds-mutate)| This is customers.feeds.mutate operation. |
| [customers.generateAdGroupThemes](#customers-generate-ad-group-themes)| This is customers.generateAdGroupThemes operation. |
| [customers.generateAudienceCompositionInsights](#customers-generate-audience-composition-insights)| This is customers.generateAudienceCompositionInsights operation. |
| [customers.generateAudienceOverlapInsights](#customers-generate-audience-overlap-insights)| This is customers.generateAudienceOverlapInsights operation. |
| [customers.generateInsightsFinderReport](#customers-generate-insights-finder-report)| This is customers.generateInsightsFinderReport operation. |
| [customers.generateKeywordForecastMetrics](#customers-generate-keyword-forecast-metrics)| This is customers.generateKeywordForecastMetrics operation. |
| [customers.generateKeywordHistoricalMetrics](#customers-generate-keyword-historical-metrics)| This is customers.generateKeywordHistoricalMetrics operation. |
| [customers.generateKeywordIdeas](#customers-generate-keyword-ideas)| This is customers.generateKeywordIdeas operation. |
| [customers.generateReachForecast](#customers-generate-reach-forecast)| This is customers.generateReachForecast operation. |
| [customers.generateShareablePreviews](#customers-generate-shareable-previews)| This is customers.generateShareablePreviews operation. |
| [customers.generateSuggestedTargetingInsights](#customers-generate-suggested-targeting-insights)| This is customers.generateSuggestedTargetingInsights operation. |
| [customers.getIdentityVerification](#customers-get-identity-verification)| This is customers.getIdentityVerification operation. |
| [customers.googleAds.mutate](#customers-google-ads-mutate)| This is customers.googleAds.mutate operation. |
| [customers.googleAds.search](#customers-google-ads-search)| This is customers.googleAds.search operation. |
| [customers.googleAds.searchStream](#customers-google-ads-search-stream)| This is customers.googleAds.searchStream operation. |
| [customers.invoices.list](#customers-invoices-list)| This is customers.invoices.list operation. |
| [customers.keywordPlanAdGroupKeywords.mutate](#customers-keyword-plan-ad-group-keywords-mutate)| This is customers.keywordPlanAdGroupKeywords.mutate operation. |
| [customers.keywordPlanAdGroups.mutate](#customers-keyword-plan-ad-groups-mutate)| This is customers.keywordPlanAdGroups.mutate operation. |
| [customers.keywordPlanCampaignKeywords.mutate](#customers-keyword-plan-campaign-keywords-mutate)| This is customers.keywordPlanCampaignKeywords.mutate operation. |
| [customers.keywordPlanCampaigns.mutate](#customers-keyword-plan-campaigns-mutate)| This is customers.keywordPlanCampaigns.mutate operation. |
| [customers.keywordPlans.mutate](#customers-keyword-plans-mutate)| This is customers.keywordPlans.mutate operation. |
| [customers.labels.mutate](#customers-labels-mutate)| This is customers.labels.mutate operation. |
| [customers.listAccessibleCustomers](#customers-list-accessible-customers)| This is customers.listAccessibleCustomers operation. |
| [customers.localServices.appendLeadConversation](#customers-local-services-append-lead-conversation)| This is customers.localServices.appendLeadConversation operation. |
| [customers.mutate](#customers-mutate)| This is customers.mutate operation. |
| [customers.offlineUserDataJobs.addOperations](#customers-offline-user-data-jobs-add-operations)| This is customers.offlineUserDataJobs.addOperations operation. |
| [customers.offlineUserDataJobs.create](#customers-offline-user-data-jobs-create)| This is customers.offlineUserDataJobs.create operation. |
| [customers.offlineUserDataJobs.run](#customers-offline-user-data-jobs-run)| This is customers.offlineUserDataJobs.run operation. |
| [customers.operations.cancel](#customers-operations-cancel)| This is customers.operations.cancel operation. |
| [customers.operations.get](#customers-operations-get)| This is customers.operations.get operation. |
| [customers.operations.list](#customers-operations-list)| This is customers.operations.list operation. |
| [customers.operations.wait](#customers-operations-wait)| This is customers.operations.wait operation. |
| [customers.paymentsAccounts.list](#customers-payments-accounts-list)| This is customers.paymentsAccounts.list operation. |
| [customers.productLinkInvitations.create](#customers-product-link-invitations-create)| This is customers.productLinkInvitations.create operation. |
| [customers.productLinkInvitations.remove](#customers-product-link-invitations-remove)| This is customers.productLinkInvitations.remove operation. |
| [customers.productLinkInvitations.update](#customers-product-link-invitations-update)| This is customers.productLinkInvitations.update operation. |
| [customers.productLinks.create](#customers-product-links-create)| This is customers.productLinks.create operation. |
| [customers.productLinks.remove](#customers-product-links-remove)| This is customers.productLinks.remove operation. |
| [customers.recommendationSubscriptions.mutateRecommendationSubscription](#customers-recommendation-subscriptions-mutate-recommendation-subscription)| This is customers.recommendationSubscriptions.mutateRecommendationSubscription operation. |
| [customers.recommendations.apply](#customers-recommendations-apply)| This is customers.recommendations.apply operation. |
| [customers.recommendations.dismiss](#customers-recommendations-dismiss)| This is customers.recommendations.dismiss operation. |
| [customers.recommendations.generate](#customers-recommendations-generate)| This is customers.recommendations.generate operation. |
| [customers.remarketingActions.mutate](#customers-remarketing-actions-mutate)| This is customers.remarketingActions.mutate operation. |
| [customers.searchAudienceInsightsAttributes](#customers-search-audience-insights-attributes)| This is customers.searchAudienceInsightsAttributes operation. |
| [customers.sharedCriteria.mutate](#customers-shared-criteria-mutate)| This is customers.sharedCriteria.mutate operation. |
| [customers.sharedSets.mutate](#customers-shared-sets-mutate)| This is customers.sharedSets.mutate operation. |
| [customers.smartCampaignSettings.getSmartCampaignStatus](#customers-smart-campaign-settings-get-smart-campaign-status)| This is customers.smartCampaignSettings.getSmartCampaignStatus operation. |
| [customers.smartCampaignSettings.mutate](#customers-smart-campaign-settings-mutate)| This is customers.smartCampaignSettings.mutate operation. |
| [customers.startIdentityVerification](#customers-start-identity-verification)| This is customers.startIdentityVerification operation. |
| [customers.suggestBrands](#customers-suggest-brands)| This is customers.suggestBrands operation. |
| [customers.suggestKeywordThemes](#customers-suggest-keyword-themes)| This is customers.suggestKeywordThemes operation. |
| [customers.suggestSmartCampaignAd](#customers-suggest-smart-campaign-ad)| This is customers.suggestSmartCampaignAd operation. |
| [customers.suggestSmartCampaignBudgetOptions](#customers-suggest-smart-campaign-budget-options)| This is customers.suggestSmartCampaignBudgetOptions operation. |
| [customers.suggestTravelAssets](#customers-suggest-travel-assets)| This is customers.suggestTravelAssets operation. |
| [customers.thirdPartyAppAnalyticsLinks.regenerateShareableLinkId](#customers-third-party-app-analytics-links-regenerate-shareable-link-id)| This is customers.thirdPartyAppAnalyticsLinks.regenerateShareableLinkId operation. |
| [customers.uploadCallConversions](#customers-upload-call-conversions)| This is customers.uploadCallConversions operation. |
| [customers.uploadClickConversions](#customers-upload-click-conversions)| This is customers.uploadClickConversions operation. |
| [customers.uploadConversionAdjustments](#customers-upload-conversion-adjustments)| This is customers.uploadConversionAdjustments operation. |
| [customers.uploadUserData](#customers-upload-user-data)| This is customers.uploadUserData operation. |
| [customers.userListCustomerTypes.mutate](#customers-user-list-customer-types-mutate)| This is customers.userListCustomerTypes.mutate operation. |
| [customers.userLists.mutate](#customers-user-lists-mutate)| This is customers.userLists.mutate operation. |
| [geoTargetConstants.suggest](#geo-target-constants-suggest)| This is geoTargetConstants.suggest operation. |
| [googleAdsFields.get](#google-ads-fields-get)| This is googleAdsFields.get operation. |
| [googleAdsFields.search](#google-ads-fields-search)| This is googleAdsFields.search operation. |
| [keywordThemeConstants.suggest](#keyword-theme-constants-suggest)| This is keywordThemeConstants.suggest operation. |
| [listPlannableLocations](#list-plannable-locations)| This is listPlannableLocations operation. |
| [listPlannableProducts](#list-plannable-products)| This is listPlannableProducts operation. |

## Operation Details

This section provides details on each of the operations.

### Audience Insights List Insights Eligible Dates

This is audienceInsights.listInsightsEligibleDates operation.

**audienceInsights.listInsightsEligibleDates**

```xml
<googleAdNetwork.audienceInsights.listInsightsEligibleDates>
</googleAdNetwork.audienceInsights.listInsightsEligibleDates>
```

**Properties**

### Customers Ad Group Criterion Customizers Mutate

This is customers.AdGroupCriterionCustomizers.mutate operation.

**customers.AdGroupCriterionCustomizers.mutate**

```xml
<googleAdNetwork.customers.AdGroupCriterionCustomizers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.AdGroupCriterionCustomizers.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad group criterion customizers are being modified.
* operations[]: Required. The list of operations to perform on individual ad group criterion customizers. Type: object (AdGroupCriterionCustomizerOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Customer Customizers Mutate

This is customers.CustomerCustomizers.mutate operation.

**customers.CustomerCustomizers.mutate**

```xml
<googleAdNetwork.customers.CustomerCustomizers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.CustomerCustomizers.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer customizers are being modified.
* operations[]: Required. The list of operations to perform on individual customer customizers. Type: object (CustomerCustomizerOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Account Budget Proposals Mutate

This is customers.accountBudgetProposals.mutate operation.

**customers.accountBudgetProposals.mutate**

```xml
<googleAdNetwork.customers.accountBudgetProposals.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.accountBudgetProposals.mutate>
```

**Properties**

* customerId: Required. The ID of the customer.
* operation: Required. The operation to perform on an individual account-level budget proposal. Type: object (AccountBudgetProposalOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Account Links Create

This is customers.accountLinks.create operation.

**customers.accountLinks.create**

```xml
<googleAdNetwork.customers.accountLinks.create>
    <customerId>{$ctx:customerId}</customerId>
    <accountLink>{$ctx:accountLink}</accountLink>
</googleAdNetwork.customers.accountLinks.create>
```

**Properties**

* customerId: Required. The ID of the customer for which the account link is created.
* accountLink: Required. The account link to be created. Type: object (AccountLink)
### Customers Account Links Mutate

This is customers.accountLinks.mutate operation.

**customers.accountLinks.mutate**

```xml
<googleAdNetwork.customers.accountLinks.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.accountLinks.mutate>
```

**Properties**

* customerId: Required. The ID of the customer being modified.
* operation: Required. The operation to perform on the link. Type: object (AccountLinkOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Ad Group Ad Labels Mutate

This is customers.adGroupAdLabels.mutate operation.

**customers.adGroupAdLabels.mutate**

```xml
<googleAdNetwork.customers.adGroupAdLabels.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.adGroupAdLabels.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose ad group ad labels are being modified.
* operations[]: Required. The list of operations to perform on ad group ad labels. Type: object (AdGroupAdLabelOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Ad Group Ads Mutate

This is customers.adGroupAds.mutate operation.

**customers.adGroupAds.mutate**

```xml
<googleAdNetwork.customers.adGroupAds.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupAds.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ads are being modified.
* operations[]: Required. The list of operations to perform on individual ads. Type: object (AdGroupAdOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Ads Remove Automatically Created Assets

This is customers.adGroupAds.removeAutomaticallyCreatedAssets operation.

**customers.adGroupAds.removeAutomaticallyCreatedAssets**

```xml
<googleAdNetwork.customers.adGroupAds.removeAutomaticallyCreatedAssets>
    <adGroupAd>{$ctx:adGroupAd}</adGroupAd>
    <assetsWithFieldType[]>{$ctx:assetsWithFieldType[]}</assetsWithFieldType[]>
</googleAdNetwork.customers.adGroupAds.removeAutomaticallyCreatedAssets>
```

**Properties**

* adGroupAd: Required. The resource name of the AdGroupAd from which to remove automatically created assets.
* assetsWithFieldType[]: Required. List of assets with field type to be removed from the AdGroupAd. Type: object (AssetsWithFieldType)
### Customers Ad Group Asset Sets Mutate

This is customers.adGroupAssetSets.mutate operation.

**customers.adGroupAssetSets.mutate**

```xml
<googleAdNetwork.customers.adGroupAssetSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupAssetSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad group asset sets are being modified.
* operations[]: Required. The list of operations to perform on individual ad group asset sets. Type: object (AdGroupAssetSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Assets Mutate

This is customers.adGroupAssets.mutate operation.

**customers.adGroupAssets.mutate**

```xml
<googleAdNetwork.customers.adGroupAssets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupAssets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad group assets are being modified.
* operations[]: Required. The list of operations to perform on individual ad group assets. Type: object (AdGroupAssetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Bid Modifiers Mutate

This is customers.adGroupBidModifiers.mutate operation.

**customers.adGroupBidModifiers.mutate**

```xml
<googleAdNetwork.customers.adGroupBidModifiers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupBidModifiers.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose ad group bid modifiers are being modified.
* operations[]: Required. The list of operations to perform on individual ad group bid modifiers. Type: object (AdGroupBidModifierOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Criteria Mutate

This is customers.adGroupCriteria.mutate operation.

**customers.adGroupCriteria.mutate**

```xml
<googleAdNetwork.customers.adGroupCriteria.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupCriteria.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose criteria are being modified.
* operations[]: Required. The list of operations to perform on individual criteria. Type: object (AdGroupCriterionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Criterion Labels Mutate

This is customers.adGroupCriterionLabels.mutate operation.

**customers.adGroupCriterionLabels.mutate**

```xml
<googleAdNetwork.customers.adGroupCriterionLabels.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.adGroupCriterionLabels.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose ad group criterion labels are being modified.
* operations[]: Required. The list of operations to perform on ad group criterion labels. Type: object (AdGroupCriterionLabelOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Ad Group Customizers Mutate

This is customers.adGroupCustomizers.mutate operation.

**customers.adGroupCustomizers.mutate**

```xml
<googleAdNetwork.customers.adGroupCustomizers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupCustomizers.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad group customizers are being modified.
* operations[]: Required. The list of operations to perform on individual ad group customizers. Type: object (AdGroupCustomizerOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Extension Settings Mutate

This is customers.adGroupExtensionSettings.mutate operation.

**customers.adGroupExtensionSettings.mutate**

```xml
<googleAdNetwork.customers.adGroupExtensionSettings.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.adGroupExtensionSettings.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad group extension settings are being modified.
* operations[]: Required. The list of operations to perform on individual ad group extension settings. Type: object (AdGroupExtensionSettingOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Ad Group Feeds Mutate

This is customers.adGroupFeeds.mutate operation.

**customers.adGroupFeeds.mutate**

```xml
<googleAdNetwork.customers.adGroupFeeds.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroupFeeds.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad group feeds are being modified.
* operations[]: Required. The list of operations to perform on individual ad group feeds. Type: object (AdGroupFeedOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Group Labels Mutate

This is customers.adGroupLabels.mutate operation.

**customers.adGroupLabels.mutate**

```xml
<googleAdNetwork.customers.adGroupLabels.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.adGroupLabels.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose ad group labels are being modified.
* operations[]: Required. The list of operations to perform on ad group labels. Type: object (AdGroupLabelOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Ad Groups Mutate

This is customers.adGroups.mutate operation.

**customers.adGroups.mutate**

```xml
<googleAdNetwork.customers.adGroups.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adGroups.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad groups are being modified.
* operations[]: Required. The list of operations to perform on individual ad groups. Type: object (AdGroupOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ad Parameters Mutate

This is customers.adParameters.mutate operation.

**customers.adParameters.mutate**

```xml
<googleAdNetwork.customers.adParameters.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.adParameters.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ad parameters are being modified.
* operations[]: Required. The list of operations to perform on individual ad parameters. Type: object (AdParameterOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Ads Mutate

This is customers.ads.mutate operation.

**customers.ads.mutate**

```xml
<googleAdNetwork.customers.ads.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.ads.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose ads are being modified.
* operations[]: Required. The list of operations to perform on individual ads. Type: object (AdOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Asset Group Assets Mutate

This is customers.assetGroupAssets.mutate operation.

**customers.assetGroupAssets.mutate**

```xml
<googleAdNetwork.customers.assetGroupAssets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.assetGroupAssets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose asset group assets are being modified.
* operations[]: Required. The list of operations to perform on individual asset group assets. Type: object (AssetGroupAssetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Asset Group Listing Group Filters Mutate

This is customers.assetGroupListingGroupFilters.mutate operation.

**customers.assetGroupListingGroupFilters.mutate**

```xml
<googleAdNetwork.customers.assetGroupListingGroupFilters.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.assetGroupListingGroupFilters.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose asset group listing group filters are being modified.
* operations[]: Required. The list of operations to perform on individual asset group listing group filters. Type: object (AssetGroupListingGroupFilterOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Asset Group Signals Mutate

This is customers.assetGroupSignals.mutate operation.

**customers.assetGroupSignals.mutate**

```xml
<googleAdNetwork.customers.assetGroupSignals.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.assetGroupSignals.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose asset group signals are being modified.
* operations[]: Required. The list of operations to perform on individual asset group signals. Type: object (AssetGroupSignalOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Asset Groups Mutate

This is customers.assetGroups.mutate operation.

**customers.assetGroups.mutate**

```xml
<googleAdNetwork.customers.assetGroups.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.assetGroups.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose asset groups are being modified.
* operations[]: Required. The list of operations to perform on individual asset groups. Type: object (AssetGroupOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Asset Set Assets Mutate

This is customers.assetSetAssets.mutate operation.

**customers.assetSetAssets.mutate**

```xml
<googleAdNetwork.customers.assetSetAssets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.assetSetAssets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose asset set assets are being modified.
* operations[]: Required. The list of operations to perform on individual asset set assets. Type: object (AssetSetAssetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Asset Sets Mutate

This is customers.assetSets.mutate operation.

**customers.assetSets.mutate**

```xml
<googleAdNetwork.customers.assetSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.assetSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose asset sets are being modified.
* operations[]: Required. The list of operations to perform on individual asset sets. Type: object (AssetSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Assets Mutate

This is customers.assets.mutate operation.

**customers.assets.mutate**

```xml
<googleAdNetwork.customers.assets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.assets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose assets are being modified.
* operations[]: Required. The list of operations to perform on individual assets. Type: object (AssetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Audiences Mutate

This is customers.audiences.mutate operation.

**customers.audiences.mutate**

```xml
<googleAdNetwork.customers.audiences.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.audiences.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose audiences are being modified.
* operations[]: Required. The list of operations to perform on individual audiences. Type: object (AudienceOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Batch Jobs Add Operations

This is customers.batchJobs.addOperations operation.

**customers.batchJobs.addOperations**

```xml
<googleAdNetwork.customers.batchJobs.addOperations>
    <resourceName>{$ctx:resourceName}</resourceName>
    <sequenceToken>{$ctx:sequenceToken}</sequenceToken>
    <mutateOperations[]>{$ctx:mutateOperations[]}</mutateOperations[]>
</googleAdNetwork.customers.batchJobs.addOperations>
```

**Properties**

* resourceName: Required. The resource name of the batch job.
* sequenceToken: A token used to enforce sequencing. Type: string
* mutateOperations[]: Required. The list of mutates being added. Type: object (MutateOperation)
### Customers Batch Jobs List Results

This is customers.batchJobs.listResults operation.

**customers.batchJobs.listResults**

```xml
<googleAdNetwork.customers.batchJobs.listResults>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.batchJobs.listResults>
```

**Properties**

* resourceName: Required. The resource name of the batch job whose results are being listed.
### Customers Batch Jobs Mutate

This is customers.batchJobs.mutate operation.

**customers.batchJobs.mutate**

```xml
<googleAdNetwork.customers.batchJobs.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
</googleAdNetwork.customers.batchJobs.mutate>
```

**Properties**

* customerId: Required. The ID of the customer for which to create a batch job.
* operation: Required. The operation to perform on an individual batch job. Type: object (BatchJobOperation)
### Customers Batch Jobs Run

This is customers.batchJobs.run operation.

**customers.batchJobs.run**

```xml
<googleAdNetwork.customers.batchJobs.run>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.batchJobs.run>
```

**Properties**

* resourceName: Required. The resource name of the BatchJob to run.
### Customers Bidding Data Exclusions Mutate

This is customers.biddingDataExclusions.mutate operation.

**customers.biddingDataExclusions.mutate**

```xml
<googleAdNetwork.customers.biddingDataExclusions.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.biddingDataExclusions.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose data exclusions are being modified.
* operations[]: Required. The list of operations to perform on individual data exclusions. Type: object (BiddingDataExclusionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Bidding Seasonality Adjustments Mutate

This is customers.biddingSeasonalityAdjustments.mutate operation.

**customers.biddingSeasonalityAdjustments.mutate**

```xml
<googleAdNetwork.customers.biddingSeasonalityAdjustments.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.biddingSeasonalityAdjustments.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose seasonality adjustments are being modified.
* operations[]: Required. The list of operations to perform on individual seasonality adjustments. Type: object (BiddingSeasonalityAdjustmentOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Bidding Strategies Mutate

This is customers.biddingStrategies.mutate operation.

**customers.biddingStrategies.mutate**

```xml
<googleAdNetwork.customers.biddingStrategies.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.biddingStrategies.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose bidding strategies are being modified.
* operations[]: Required. The list of operations to perform on individual bidding strategies. Type: object (BiddingStrategyOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Billing Setups Mutate

This is customers.billingSetups.mutate operation.

**customers.billingSetups.mutate**

```xml
<googleAdNetwork.customers.billingSetups.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
</googleAdNetwork.customers.billingSetups.mutate>
```

**Properties**

* customerId: Required. Id of the customer to apply the billing setup mutate operation to.
* operation: Required. The operation to perform. Type: object (BillingSetupOperation)
### Customers Campaign Asset Sets Mutate

This is customers.campaignAssetSets.mutate operation.

**customers.campaignAssetSets.mutate**

```xml
<googleAdNetwork.customers.campaignAssetSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignAssetSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign asset sets are being modified.
* operations[]: Required. The list of operations to perform on individual campaign asset sets. Type: object (CampaignAssetSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Assets Mutate

This is customers.campaignAssets.mutate operation.

**customers.campaignAssets.mutate**

```xml
<googleAdNetwork.customers.campaignAssets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignAssets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign assets are being modified.
* operations[]: Required. The list of operations to perform on individual campaign assets. Type: object (CampaignAssetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Bid Modifiers Mutate

This is customers.campaignBidModifiers.mutate operation.

**customers.campaignBidModifiers.mutate**

```xml
<googleAdNetwork.customers.campaignBidModifiers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignBidModifiers.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose campaign bid modifiers are being modified.
* operations[]: Required. The list of operations to perform on individual campaign bid modifiers. Type: object (CampaignBidModifierOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Budgets Mutate

This is customers.campaignBudgets.mutate operation.

**customers.campaignBudgets.mutate**

```xml
<googleAdNetwork.customers.campaignBudgets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignBudgets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign budgets are being modified.
* operations[]: Required. The list of operations to perform on individual campaign budgets. Type: object (CampaignBudgetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Conversion Goals Mutate

This is customers.campaignConversionGoals.mutate operation.

**customers.campaignConversionGoals.mutate**

```xml
<googleAdNetwork.customers.campaignConversionGoals.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.campaignConversionGoals.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign conversion goals are being modified.
* operations[]: Required. The list of operations to perform on individual campaign conversion goal. Type: object (CampaignConversionGoalOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Campaign Criteria Mutate

This is customers.campaignCriteria.mutate operation.

**customers.campaignCriteria.mutate**

```xml
<googleAdNetwork.customers.campaignCriteria.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignCriteria.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose criteria are being modified.
* operations[]: Required. The list of operations to perform on individual criteria. Type: object (CampaignCriterionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Customizers Mutate

This is customers.campaignCustomizers.mutate operation.

**customers.campaignCustomizers.mutate**

```xml
<googleAdNetwork.customers.campaignCustomizers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignCustomizers.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign customizers are being modified.
* operations[]: Required. The list of operations to perform on individual campaign customizers. Type: object (CampaignCustomizerOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Drafts List Async Errors

This is customers.campaignDrafts.listAsyncErrors operation.

**customers.campaignDrafts.listAsyncErrors**

```xml
<googleAdNetwork.customers.campaignDrafts.listAsyncErrors>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.campaignDrafts.listAsyncErrors>
```

**Properties**

* resourceName: Required. The name of the campaign draft from which to retrieve the async errors.
### Customers Campaign Drafts Mutate

This is customers.campaignDrafts.mutate operation.

**customers.campaignDrafts.mutate**

```xml
<googleAdNetwork.customers.campaignDrafts.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignDrafts.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign drafts are being modified.
* operations[]: Required. The list of operations to perform on individual campaign drafts. Type: object (CampaignDraftOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Drafts Promote

This is customers.campaignDrafts.promote operation.

**customers.campaignDrafts.promote**

```xml
<googleAdNetwork.customers.campaignDrafts.promote>
    <campaignDraft>{$ctx:campaignDraft}</campaignDraft>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.campaignDrafts.promote>
```

**Properties**

* campaignDraft: Required. The resource name of the campaign draft to promote.
* validateOnly: If true, the request is validated but no Long Running Operation is created. Only errors are returned. Type: boolean
### Customers Campaign Extension Settings Mutate

This is customers.campaignExtensionSettings.mutate operation.

**customers.campaignExtensionSettings.mutate**

```xml
<googleAdNetwork.customers.campaignExtensionSettings.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignExtensionSettings.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign extension settings are being modified.
* operations[]: Required. The list of operations to perform on individual campaign extension settings. Type: object (CampaignExtensionSettingOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Feeds Mutate

This is customers.campaignFeeds.mutate operation.

**customers.campaignFeeds.mutate**

```xml
<googleAdNetwork.customers.campaignFeeds.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignFeeds.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign feeds are being modified.
* operations[]: Required. The list of operations to perform on individual campaign feeds. Type: object (CampaignFeedOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Groups Mutate

This is customers.campaignGroups.mutate operation.

**customers.campaignGroups.mutate**

```xml
<googleAdNetwork.customers.campaignGroups.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignGroups.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign groups are being modified.
* operations[]: Required. The list of operations to perform on individual campaign groups. Type: object (CampaignGroupOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaign Labels Mutate

This is customers.campaignLabels.mutate operation.

**customers.campaignLabels.mutate**

```xml
<googleAdNetwork.customers.campaignLabels.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.campaignLabels.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose campaign-label relationships are being modified.
* operations[]: Required. The list of operations to perform on campaign-label relationships. Type: object (CampaignLabelOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Campaign Lifecycle Goal Configure Campaign Lifecycle Goals

This is customers.campaignLifecycleGoal.configureCampaignLifecycleGoals operation.

**customers.campaignLifecycleGoal.configureCampaignLifecycleGoals**

```xml
<googleAdNetwork.customers.campaignLifecycleGoal.configureCampaignLifecycleGoals>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.campaignLifecycleGoal.configureCampaignLifecycleGoals>
```

**Properties**

* customerId: Required. The ID of the customer performing the upload.
* operation: Required. The operation to perform campaign lifecycle goal update. Type: object (CampaignLifecycleGoalOperation)
* validateOnly: Optional. If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Campaign Shared Sets Mutate

This is customers.campaignSharedSets.mutate operation.

**customers.campaignSharedSets.mutate**

```xml
<googleAdNetwork.customers.campaignSharedSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaignSharedSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign shared sets are being modified.
* operations[]: Required. The list of operations to perform on individual campaign shared sets. Type: object (CampaignSharedSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Campaigns Mutate

This is customers.campaigns.mutate operation.

**customers.campaigns.mutate**

```xml
<googleAdNetwork.customers.campaigns.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.campaigns.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaigns are being modified.
* operations[]: Required. The list of operations to perform on individual campaigns. Type: object (CampaignOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Conversion Actions Mutate

This is customers.conversionActions.mutate operation.

**customers.conversionActions.mutate**

```xml
<googleAdNetwork.customers.conversionActions.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.conversionActions.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose conversion actions are being modified.
* operations[]: Required. The list of operations to perform on individual conversion actions. Type: object (ConversionActionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Conversion Custom Variables Mutate

This is customers.conversionCustomVariables.mutate operation.

**customers.conversionCustomVariables.mutate**

```xml
<googleAdNetwork.customers.conversionCustomVariables.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.conversionCustomVariables.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose conversion custom variables are being modified.
* operations[]: Required. The list of operations to perform on individual conversion custom variables. Type: object (ConversionCustomVariableOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Conversion Goal Campaign Configs Mutate

This is customers.conversionGoalCampaignConfigs.mutate operation.

**customers.conversionGoalCampaignConfigs.mutate**

```xml
<googleAdNetwork.customers.conversionGoalCampaignConfigs.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.conversionGoalCampaignConfigs.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose custom conversion goals are being modified.
* operations[]: Required. The list of operations to perform on individual conversion goal campaign config. Type: object (ConversionGoalCampaignConfigOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Conversion Value Rule Sets Mutate

This is customers.conversionValueRuleSets.mutate operation.

**customers.conversionValueRuleSets.mutate**

```xml
<googleAdNetwork.customers.conversionValueRuleSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.conversionValueRuleSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose conversion value rule sets are being modified.
* operations[]: Required. The list of operations to perform on individual conversion value rule sets. Type: object (ConversionValueRuleSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Conversion Value Rules Mutate

This is customers.conversionValueRules.mutate operation.

**customers.conversionValueRules.mutate**

```xml
<googleAdNetwork.customers.conversionValueRules.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.conversionValueRules.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose conversion value rules are being modified.
* operations[]: Required. The list of operations to perform on individual conversion value rules. Type: object (ConversionValueRuleOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Create Customer Client

This is customers.createCustomerClient operation.

**customers.createCustomerClient**

```xml
<googleAdNetwork.customers.createCustomerClient>
    <customerId>{$ctx:customerId}</customerId>
    <customerClient>{$ctx:customerClient}</customerClient>
    <accessRole>{$ctx:accessRole}</accessRole>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <emailAddress>{$ctx:emailAddress}</emailAddress>
</googleAdNetwork.customers.createCustomerClient>
```

**Properties**

* customerId: Required. The ID of the Manager under whom client customer is being created.
* customerClient: Required. The new client customer to create. The resource name on this customer will be ignored. Type: object (Customer)
* accessRole: The proposed role of user on the created client customer. Accessible only to customers on the allow-list. Type: enum (AccessRole)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* emailAddress: Email address of the user who should be invited on the created client customer. Accessible only to customers on the allow-list. Type: string
### Customers Custom Audiences Mutate

This is customers.customAudiences.mutate operation.

**customers.customAudiences.mutate**

```xml
<googleAdNetwork.customers.customAudiences.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customAudiences.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose custom audiences are being modified.
* operations[]: Required. The list of operations to perform on individual custom audiences. Type: object (CustomAudienceOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Custom Conversion Goals Mutate

This is customers.customConversionGoals.mutate operation.

**customers.customConversionGoals.mutate**

```xml
<googleAdNetwork.customers.customConversionGoals.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customConversionGoals.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose custom conversion goals are being modified.
* operations[]: Required. The list of operations to perform on individual custom conversion goal. Type: object (CustomConversionGoalOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Custom Interests Mutate

This is customers.customInterests.mutate operation.

**customers.customInterests.mutate**

```xml
<googleAdNetwork.customers.customInterests.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customInterests.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose custom interests are being modified.
* operations[]: Required. The list of operations to perform on individual custom interests. Type: object (CustomInterestOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Asset Sets Mutate

This is customers.customerAssetSets.mutate operation.

**customers.customerAssetSets.mutate**

```xml
<googleAdNetwork.customers.customerAssetSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customerAssetSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer asset sets are being modified.
* operations[]: Required. The list of operations to perform on individual customer asset sets. Type: object (CustomerAssetSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Customer Assets Mutate

This is customers.customerAssets.mutate operation.

**customers.customerAssets.mutate**

```xml
<googleAdNetwork.customers.customerAssets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customerAssets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer assets are being modified.
* operations[]: Required. The list of operations to perform on individual customer assets. Type: object (CustomerAssetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Customer Client Links Mutate

This is customers.customerClientLinks.mutate operation.

**customers.customerClientLinks.mutate**

```xml
<googleAdNetwork.customers.customerClientLinks.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customerClientLinks.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer link are being modified.
* operation: Required. The operation to perform on the individual CustomerClientLink. Type: object (CustomerClientLinkOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Conversion Goals Mutate

This is customers.customerConversionGoals.mutate operation.

**customers.customerConversionGoals.mutate**

```xml
<googleAdNetwork.customers.customerConversionGoals.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customerConversionGoals.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer conversion goals are being modified.
* operations[]: Required. The list of operations to perform on individual customer conversion goal. Type: object (CustomerConversionGoalOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Extension Settings Mutate

This is customers.customerExtensionSettings.mutate operation.

**customers.customerExtensionSettings.mutate**

```xml
<googleAdNetwork.customers.customerExtensionSettings.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customerExtensionSettings.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer extension settings are being modified.
* operations[]: Required. The list of operations to perform on individual customer extension settings. Type: object (CustomerExtensionSettingOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Customer Feeds Mutate

This is customers.customerFeeds.mutate operation.

**customers.customerFeeds.mutate**

```xml
<googleAdNetwork.customers.customerFeeds.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customerFeeds.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer feeds are being modified.
* operations[]: Required. The list of operations to perform on individual customer feeds. Type: object (CustomerFeedOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Customer Labels Mutate

This is customers.customerLabels.mutate operation.

**customers.customerLabels.mutate**

```xml
<googleAdNetwork.customers.customerLabels.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customerLabels.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose customer-label relationships are being modified.
* operations[]: Required. The list of operations to perform on customer-label relationships. Type: object (CustomerLabelOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Lifecycle Goal Configure Customer Lifecycle Goals

This is customers.customerLifecycleGoal.configureCustomerLifecycleGoals operation.

**customers.customerLifecycleGoal.configureCustomerLifecycleGoals**

```xml
<googleAdNetwork.customers.customerLifecycleGoal.configureCustomerLifecycleGoals>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customerLifecycleGoal.configureCustomerLifecycleGoals>
```

**Properties**

* customerId: Required. The ID of the customer performing the upload.
* operation: Required. The operation to perform customer lifecycle goal update. Type: object (CustomerLifecycleGoalOperation)
* validateOnly: Optional. If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Manager Links Move Manager Link

This is customers.customerManagerLinks.moveManagerLink operation.

**customers.customerManagerLinks.moveManagerLink**

```xml
<googleAdNetwork.customers.customerManagerLinks.moveManagerLink>
    <customerId>{$ctx:customerId}</customerId>
    <previousCustomerManagerLink>{$ctx:previousCustomerManagerLink}</previousCustomerManagerLink>
    <newManager>{$ctx:newManager}</newManager>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customerManagerLinks.moveManagerLink>
```

**Properties**

* customerId: Required. The ID of the client customer that is being moved.
* previousCustomerManagerLink: Required. The resource name of the previous CustomerManagerLink. The resource name has the form:customers/{customerId}/customerManagerLinks/{manager_customer_id}~{managerLinkId} Type: string
* newManager: Required. The resource name of the new manager customer that the client wants to move to. Customer resource names have the format: "customers/{customerId}" Type: string
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Manager Links Mutate

This is customers.customerManagerLinks.mutate operation.

**customers.customerManagerLinks.mutate**

```xml
<googleAdNetwork.customers.customerManagerLinks.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.customerManagerLinks.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customer manager links are being modified.
* operations[]: Required. The list of operations to perform on individual customer manager links. Type: object (CustomerManagerLinkOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Customer Negative Criteria Mutate

This is customers.customerNegativeCriteria.mutate operation.

**customers.customerNegativeCriteria.mutate**

```xml
<googleAdNetwork.customers.customerNegativeCriteria.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customerNegativeCriteria.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose criteria are being modified.
* operations[]: Required. The list of operations to perform on individual criteria. Type: object (CustomerNegativeCriterionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Customer Sk Ad Network Conversion Value Schemas Mutate

This is customers.customerSkAdNetworkConversionValueSchemas.mutate operation.

**customers.customerSkAdNetworkConversionValueSchemas.mutate**

```xml
<googleAdNetwork.customers.customerSkAdNetworkConversionValueSchemas.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <enableWarnings>{$ctx:enableWarnings}</enableWarnings>
</googleAdNetwork.customers.customerSkAdNetworkConversionValueSchemas.mutate>
```

**Properties**

* customerId: The ID of the customer whose shared sets are being modified.
* operation: The operation to perform. Type: object (CustomerSkAdNetworkConversionValueSchemaOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* enableWarnings: Optional. If true, enables returning warnings. Warnings return error messages and error codes without blocking the execution of the mutate operation. Type: boolean
### Customers Customer User Access Invitations Mutate

This is customers.customerUserAccessInvitations.mutate operation.

**customers.customerUserAccessInvitations.mutate**

```xml
<googleAdNetwork.customers.customerUserAccessInvitations.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
</googleAdNetwork.customers.customerUserAccessInvitations.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose access invitation is being modified.
* operation: Required. The operation to perform on the access invitation Type: object (CustomerUserAccessInvitationOperation)
### Customers Customer User Accesses Mutate

This is customers.customerUserAccesses.mutate operation.

**customers.customerUserAccesses.mutate**

```xml
<googleAdNetwork.customers.customerUserAccesses.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
</googleAdNetwork.customers.customerUserAccesses.mutate>
```

**Properties**

* customerId: Required. The ID of the customer being modified.
* operation: Required. The operation to perform on the customer Type: object (CustomerUserAccessOperation)
### Customers Customizer Attributes Mutate

This is customers.customizerAttributes.mutate operation.

**customers.customizerAttributes.mutate**

```xml
<googleAdNetwork.customers.customizerAttributes.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.customizerAttributes.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose customizer attributes are being modified.
* operations[]: Required. The list of operations to perform on individual customizer attributes. Type: object (CustomizerAttributeOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Experiment Arms Mutate

This is customers.experimentArms.mutate operation.

**customers.experimentArms.mutate**

```xml
<googleAdNetwork.customers.experimentArms.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.experimentArms.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose experiments are being modified.
* operations[]: Required. The list of operations to perform on individual experiment arm. Type: object (ExperimentArmOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Experiments End Experiment

This is customers.experiments.endExperiment operation.

**customers.experiments.endExperiment**

```xml
<googleAdNetwork.customers.experiments.endExperiment>
    <experiment>{$ctx:experiment}</experiment>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.experiments.endExperiment>
```

**Properties**

* experiment: Required. The resource name of the campaign experiment to end.
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Experiments Graduate Experiment

This is customers.experiments.graduateExperiment operation.

**customers.experiments.graduateExperiment**

```xml
<googleAdNetwork.customers.experiments.graduateExperiment>
    <experiment>{$ctx:experiment}</experiment>
    <campaignBudgetMappings[]>{$ctx:campaignBudgetMappings[]}</campaignBudgetMappings[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.experiments.graduateExperiment>
```

**Properties**

* experiment: Required. The experiment to be graduated.
* campaignBudgetMappings[]: Required. List of campaign budget mappings for graduation. Each campaign that appears here will graduate, and will be assigned a new budget that is paired with it in the mapping. The maximum size is one. Type: object (CampaignBudgetMapping)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Experiments List Experiment Async Errors

This is customers.experiments.listExperimentAsyncErrors operation.

**customers.experiments.listExperimentAsyncErrors**

```xml
<googleAdNetwork.customers.experiments.listExperimentAsyncErrors>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.experiments.listExperimentAsyncErrors>
```

**Properties**

* resourceName: Required. The name of the experiment from which to retrieve the async errors.
### Customers Experiments Mutate

This is customers.experiments.mutate operation.

**customers.experiments.mutate**

```xml
<googleAdNetwork.customers.experiments.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.experiments.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose experiments are being modified.
* operations[]: Required. The list of operations to perform on individual experiments. Type: object (ExperimentOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Experiments Promote Experiment

This is customers.experiments.promoteExperiment operation.

**customers.experiments.promoteExperiment**

```xml
<googleAdNetwork.customers.experiments.promoteExperiment>
    <resourceName>{$ctx:resourceName}</resourceName>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.experiments.promoteExperiment>
```

**Properties**

* resourceName: Required. The resource name of the experiment to promote.
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Experiments Schedule Experiment

This is customers.experiments.scheduleExperiment operation.

**customers.experiments.scheduleExperiment**

```xml
<googleAdNetwork.customers.experiments.scheduleExperiment>
    <resourceName>{$ctx:resourceName}</resourceName>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.experiments.scheduleExperiment>
```

**Properties**

* resourceName: Required. The scheduled experiment.
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Extension Feed Items Mutate

This is customers.extensionFeedItems.mutate operation.

**customers.extensionFeedItems.mutate**

```xml
<googleAdNetwork.customers.extensionFeedItems.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.extensionFeedItems.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose extension feed items are being modified.
* operations[]: Required. The list of operations to perform on individual extension feed items. Type: object (ExtensionFeedItemOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Feed Item Set Links Mutate

This is customers.feedItemSetLinks.mutate operation.

**customers.feedItemSetLinks.mutate**

```xml
<googleAdNetwork.customers.feedItemSetLinks.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.feedItemSetLinks.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose feed item set links are being modified.
* operations[]: Required. The list of operations to perform on individual feed item set links. Type: object (FeedItemSetLinkOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Feed Item Sets Mutate

This is customers.feedItemSets.mutate operation.

**customers.feedItemSets.mutate**

```xml
<googleAdNetwork.customers.feedItemSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.feedItemSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose feed item sets are being modified.
* operations[]: Required. The list of operations to perform on individual feed item sets. Type: object (FeedItemSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Feed Item Targets Mutate

This is customers.feedItemTargets.mutate operation.

**customers.feedItemTargets.mutate**

```xml
<googleAdNetwork.customers.feedItemTargets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.feedItemTargets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose feed item targets are being modified.
* operations[]: Required. The list of operations to perform on individual feed item targets. Type: object (FeedItemTargetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Feed Items Mutate

This is customers.feedItems.mutate operation.

**customers.feedItems.mutate**

```xml
<googleAdNetwork.customers.feedItems.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.feedItems.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose feed items are being modified.
* operations[]: Required. The list of operations to perform on individual feed items. Type: object (FeedItemOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Feed Mappings Mutate

This is customers.feedMappings.mutate operation.

**customers.feedMappings.mutate**

```xml
<googleAdNetwork.customers.feedMappings.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.feedMappings.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose feed mappings are being modified.
* operations[]: Required. The list of operations to perform on individual feed mappings. Type: object (FeedMappingOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Feeds Mutate

This is customers.feeds.mutate operation.

**customers.feeds.mutate**

```xml
<googleAdNetwork.customers.feeds.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.feeds.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose feeds are being modified.
* operations[]: Required. The list of operations to perform on individual feeds. Type: object (FeedOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Generate Ad Group Themes

This is customers.generateAdGroupThemes operation.

**customers.generateAdGroupThemes**

```xml
<googleAdNetwork.customers.generateAdGroupThemes>
    <customerId>{$ctx:customerId}</customerId>
    <keywords[]>{$ctx:keywords[]}</keywords[]>
    <adGroups[]>{$ctx:adGroups[]}</adGroups[]>
</googleAdNetwork.customers.generateAdGroupThemes>
```

**Properties**

* customerId: Required. The ID of the customer.
* keywords[]: Required. A list of keywords to group into the provided AdGroups. Type: string
* adGroups[]: Required. A list of resource names of AdGroups to group keywords into.  Resource name format:customers/{customerId}/adGroups/{adGroupId} Type: string
### Customers Generate Audience Composition Insights

This is customers.generateAudienceCompositionInsights operation.

**customers.generateAudienceCompositionInsights**

```xml
<googleAdNetwork.customers.generateAudienceCompositionInsights>
    <customerId>{$ctx:customerId}</customerId>
    <audience>{$ctx:audience}</audience>
    <baselineAudience>{$ctx:baselineAudience}</baselineAudience>
    <dataMonth>{$ctx:dataMonth}</dataMonth>
    <dimensions[]>{$ctx:dimensions[]}</dimensions[]>
    <customerInsightsGroup>{$ctx:customerInsightsGroup}</customerInsightsGroup>
</googleAdNetwork.customers.generateAudienceCompositionInsights>
```

**Properties**

* customerId: Required. The ID of the customer.
* audience: Required. The audience of interest for which insights are being requested. Type: object (InsightsAudience)
* baselineAudience: The baseline audience to which the audience of interest is being compared. Type: object (InsightsAudience)
* dataMonth: The one-month range of historical data to use for insights, in the format "yyyy-mm". If unset, insights will be returned for the last thirty days of data. Type: string
* dimensions[]: Required. The audience dimensions for which composition insights should be returned. Type: enum (AudienceInsightsDimension)
* customerInsightsGroup: The name of the customer being planned for. This is a user-defined value. Type: string
### Customers Generate Audience Overlap Insights

This is customers.generateAudienceOverlapInsights operation.

**customers.generateAudienceOverlapInsights**

```xml
<googleAdNetwork.customers.generateAudienceOverlapInsights>
    <customerId>{$ctx:customerId}</customerId>
    <countryLocation>{$ctx:countryLocation}</countryLocation>
    <primaryAttribute>{$ctx:primaryAttribute}</primaryAttribute>
    <dimensions[]>{$ctx:dimensions[]}</dimensions[]>
    <customerInsightsGroup>{$ctx:customerInsightsGroup}</customerInsightsGroup>
</googleAdNetwork.customers.generateAudienceOverlapInsights>
```

**Properties**

* customerId: Required. The ID of the customer.
* countryLocation: Required. The country in which to calculate the sizes and overlaps of audiences. Type: object (LocationInfo)
* primaryAttribute: Required. The audience attribute that should be intersected with all other eligible audiences. This must be an Affinity or In-Market UserInterest, an AgeRange or a Gender. Type: object (AudienceInsightsAttribute)
* dimensions[]: Required. The types of attributes of which to calculate the overlap with the primaryAttribute. The values must be a subset of AFFINITY_USER_INTEREST, IN_MARKET_USER_INTEREST, AGE_RANGE and GENDER. Type: enum (AudienceInsightsDimension)
* customerInsightsGroup: The name of the customer being planned for. This is a user-defined value. Type: string
### Customers Generate Insights Finder Report

This is customers.generateInsightsFinderReport operation.

**customers.generateInsightsFinderReport**

```xml
<googleAdNetwork.customers.generateInsightsFinderReport>
    <customerId>{$ctx:customerId}</customerId>
    <baselineAudience>{$ctx:baselineAudience}</baselineAudience>
    <specificAudience>{$ctx:specificAudience}</specificAudience>
    <customerInsightsGroup>{$ctx:customerInsightsGroup}</customerInsightsGroup>
</googleAdNetwork.customers.generateInsightsFinderReport>
```

**Properties**

* customerId: Required. The ID of the customer.
* baselineAudience: Required. A baseline audience for this report, typically all people in a region. Type: object (BasicInsightsAudience)
* specificAudience: Required. The specific audience of interest for this report. The insights in the report will be based on attributes more prevalent in this audience than in the report's baseline audience. Type: object (BasicInsightsAudience)
* customerInsightsGroup: The name of the customer being planned for. This is a user-defined value. Type: string
### Customers Generate Keyword Forecast Metrics

This is customers.generateKeywordForecastMetrics operation.

**customers.generateKeywordForecastMetrics**

```xml
<googleAdNetwork.customers.generateKeywordForecastMetrics>
    <customerId>{$ctx:customerId}</customerId>
    <forecastPeriod>{$ctx:forecastPeriod}</forecastPeriod>
    <campaign>{$ctx:campaign}</campaign>
    <currencyCode>{$ctx:currencyCode}</currencyCode>
</googleAdNetwork.customers.generateKeywordForecastMetrics>
```

**Properties**

* customerId: The ID of the customer.
* forecastPeriod: The date range for the forecast. The start date must be in the future and end date must be within 1 year from today. The reference timezone used is the one of the Google Ads account belonging to the customer. If not set, a default date range from next Sunday to the following Saturday will be used. Type: object (DateRange)
* campaign: Required. The campaign used in the forecast. Type: object (CampaignToForecast)
* currencyCode: The currency used for exchange rate conversion. By default, the account currency of the customer is used. Set this field only if the currency is different from the account currency. The list of valid currency codes can be found athttps://developers.google.com/google-ads/api/data/codes-formats#currency-codes. Type: string
### Customers Generate Keyword Historical Metrics

This is customers.generateKeywordHistoricalMetrics operation.

**customers.generateKeywordHistoricalMetrics**

```xml
<googleAdNetwork.customers.generateKeywordHistoricalMetrics>
    <customerId>{$ctx:customerId}</customerId>
    <keywords[]>{$ctx:keywords[]}</keywords[]>
    <includeAdultKeywords>{$ctx:includeAdultKeywords}</includeAdultKeywords>
    <geoTargetConstants[]>{$ctx:geoTargetConstants[]}</geoTargetConstants[]>
    <keywordPlanNetwork>{$ctx:keywordPlanNetwork}</keywordPlanNetwork>
    <aggregateMetrics>{$ctx:aggregateMetrics}</aggregateMetrics>
    <historicalMetricsOptions>{$ctx:historicalMetricsOptions}</historicalMetricsOptions>
    <language>{$ctx:language}</language>
</googleAdNetwork.customers.generateKeywordHistoricalMetrics>
```

**Properties**

* customerId: The ID of the customer with the recommendation.
* keywords[]: A list of keywords to get historical metrics. Not all inputs will be returned as a result of near-exact deduplication. For example, if stats for "car" and "cars" are requested, only "car" will be returned. A maximum of 10,000 keywords can be used. Type: string
* includeAdultKeywords: If true, adult keywords will be included in response. The default value is false. Type: boolean
* geoTargetConstants[]: The resource names of the location to target. Maximum is 10. An empty list MAY be used to specify all targeting geos. Type: string
* keywordPlanNetwork: Targeting network. If not set, Google Search And Partners Network will be used. Type: enum (KeywordPlanNetwork)
* aggregateMetrics: The aggregate fields to include in response. Type: object (KeywordPlanAggregateMetrics)
* historicalMetricsOptions: The options for historical metrics data. Type: object (HistoricalMetricsOptions)
* language: The resource name of the language to target. Each keyword belongs to some set of languages; a keyword is included if language is one of its languages. If not set, all keywords will be included. Type: string
### Customers Generate Keyword Ideas

This is customers.generateKeywordIdeas operation.

**customers.generateKeywordIdeas**

```xml
<googleAdNetwork.customers.generateKeywordIdeas>
    <customerId>{$ctx:customerId}</customerId>
    <geoTargetConstants[]>{$ctx:geoTargetConstants[]}</geoTargetConstants[]>
    <includeAdultKeywords>{$ctx:includeAdultKeywords}</includeAdultKeywords>
    <pageToken>{$ctx:pageToken}</pageToken>
    <pageSize>{$ctx:pageSize}</pageSize>
    <keywordPlanNetwork>{$ctx:keywordPlanNetwork}</keywordPlanNetwork>
    <keywordAnnotation[]>{$ctx:keywordAnnotation[]}</keywordAnnotation[]>
    <aggregateMetrics>{$ctx:aggregateMetrics}</aggregateMetrics>
    <historicalMetricsOptions>{$ctx:historicalMetricsOptions}</historicalMetricsOptions>
    <language>{$ctx:language}</language>
    <keywordAndUrlSeed>{$ctx:keywordAndUrlSeed}</keywordAndUrlSeed>
    <keywordSeed>{$ctx:keywordSeed}</keywordSeed>
    <urlSeed>{$ctx:urlSeed}</urlSeed>
    <siteSeed>{$ctx:siteSeed}</siteSeed>
</googleAdNetwork.customers.generateKeywordIdeas>
```

**Properties**

* customerId: The ID of the customer with the recommendation.
* geoTargetConstants[]: The resource names of the location to target. Maximum is 10. An empty list MAY be used to specify all targeting geos. Type: string
* includeAdultKeywords: If true, adult keywords will be included in response. The default value is false. Type: boolean
* pageToken: Token of the page to retrieve. If not specified, the first page of results will be returned. To request next page of results use the value obtained fromnextPageTokenin the previous response. The request fields must match across pages. Type: string
* pageSize: Number of results to retrieve in a single page. A maximum of 10,000 results may be returned, if the pageSize exceeds this, it is ignored. If unspecified, at most 10,000 results will be returned. The server may decide to further limit the number of returned resources. If the response contains fewer than 10,000 results it may not be assumed as last page of results. Type: integer
* keywordPlanNetwork: Targeting network. If not set, Google Search And Partners Network will be used. Type: enum (KeywordPlanNetwork)
* keywordAnnotation[]: The keyword annotations to include in response. Type: enum (KeywordPlanKeywordAnnotation)
* aggregateMetrics: The aggregate fields to include in response. Type: object (KeywordPlanAggregateMetrics)
* historicalMetricsOptions: The options for historical metrics data. Type: object (HistoricalMetricsOptions)
* language: The resource name of the language to target. Each keyword belongs to some set of languages; a keyword is included if language is one of its languages. If not set, all keywords will be included. Type: string
* keywordAndUrlSeed: A Keyword and a specific Url to generate ideas from for example, cars, www.example.com/cars. Type: object (KeywordAndUrlSeed)
* keywordSeed: A Keyword or phrase to generate ideas from, for example, cars. Type: object (KeywordSeed)
* urlSeed: A specific url to generate ideas from, for example, www.example.com/cars. Type: object (UrlSeed)
* siteSeed: The site to generate ideas from, for example, www.example.com. Type: object (SiteSeed)
### Customers Generate Reach Forecast

This is customers.generateReachForecast operation.

**customers.generateReachForecast**

```xml
<googleAdNetwork.customers.generateReachForecast>
    <customerId>{$ctx:customerId}</customerId>
    <campaignDuration>{$ctx:campaignDuration}</campaignDuration>
    <cookieFrequencyCapSetting>{$ctx:cookieFrequencyCapSetting}</cookieFrequencyCapSetting>
    <targeting>{$ctx:targeting}</targeting>
    <plannedProducts[]>{$ctx:plannedProducts[]}</plannedProducts[]>
    <forecastMetricOptions>{$ctx:forecastMetricOptions}</forecastMetricOptions>
    <currencyCode>{$ctx:currencyCode}</currencyCode>
    <cookieFrequencyCap>{$ctx:cookieFrequencyCap}</cookieFrequencyCap>
    <minEffectiveFrequency>{$ctx:minEffectiveFrequency}</minEffectiveFrequency>
    <effectiveFrequencyLimit>{$ctx:effectiveFrequencyLimit}</effectiveFrequencyLimit>
    <customerReachGroup>{$ctx:customerReachGroup}</customerReachGroup>
</googleAdNetwork.customers.generateReachForecast>
```

**Properties**

* customerId: Required. The ID of the customer.
* campaignDuration: Required. Campaign duration. Type: object (CampaignDuration)
* cookieFrequencyCapSetting: Chosen cookie frequency cap to be applied to each planned product. This is equivalent to the frequency cap exposed in Google Ads when creating a campaign, it represents the maximum number of times an ad can be shown to the same user during a specified time interval. If not specified, a default of 0 (no cap) is applied. Type: object (FrequencyCap)
* targeting: The targeting to be applied to all products selected in the product mix. Type: object (Targeting)
* plannedProducts[]: Required. The products to be forecast. The max number of allowed planned products is 15. Type: object (PlannedProduct)
* forecastMetricOptions: Controls the forecast metrics returned in the response. Type: object (ForecastMetricOptions)
* currencyCode: The currency code. Three-character ISO 4217 currency code. Type: string
* cookieFrequencyCap: Chosen cookie frequency cap to be applied to each planned product. This is equivalent to the frequency cap exposed in Google Ads when creating a campaign, it represents the maximum number of times an ad can be shown to the same user. If not specified, no cap is applied. Type: integer
* minEffectiveFrequency: Chosen minimum effective frequency (the number of times a person was exposed to the ad) for the reported reach metrics [1-10]. This won't affect the targeting, but just the reporting. If not specified, a default of 1 is applied. Type: integer
* effectiveFrequencyLimit: The highest minimum effective frequency (the number of times a person was exposed to the ad) value [1-10] to include in Forecast.effective_frequency_breakdowns. If not specified, Forecast.effective_frequency_breakdowns will not be provided. Type: object (EffectiveFrequencyLimit)
* customerReachGroup: The name of the customer being planned for. This is a user-defined value. Type: string
### Customers Generate Shareable Previews

This is customers.generateShareablePreviews operation.

**customers.generateShareablePreviews**

```xml
<googleAdNetwork.customers.generateShareablePreviews>
    <customerId>{$ctx:customerId}</customerId>
    <shareablePreviews[]>{$ctx:shareablePreviews[]}</shareablePreviews[]>
</googleAdNetwork.customers.generateShareablePreviews>
```

**Properties**

* customerId: Required. The customer creating the shareable previews request.
* shareablePreviews[]: Required. The list of shareable previews to generate. Type: object (ShareablePreview)
### Customers Generate Suggested Targeting Insights

This is customers.generateSuggestedTargetingInsights operation.

**customers.generateSuggestedTargetingInsights**

```xml
<googleAdNetwork.customers.generateSuggestedTargetingInsights>
    <customerId>{$ctx:customerId}</customerId>
    <audience>{$ctx:audience}</audience>
    <baselineAudience>{$ctx:baselineAudience}</baselineAudience>
    <dataMonth>{$ctx:dataMonth}</dataMonth>
    <customerInsightsGroup>{$ctx:customerInsightsGroup}</customerInsightsGroup>
</googleAdNetwork.customers.generateSuggestedTargetingInsights>
```

**Properties**

* customerId: Required. The ID of the customer.
* audience: Required. The audience of interest for which insights are being requested. Type: object (InsightsAudience)
* baselineAudience: Optional. The baseline audience. The default, if unspecified, is all people in the same country as the audience of interest. Type: object (InsightsAudience)
* dataMonth: Optional. The one-month range of historical data to use for insights, in the format "yyyy-mm". If unset, insights will be returned for the last thirty days of data. Type: string
* customerInsightsGroup: Optional. The name of the customer being planned for. This is a user-defined value. Type: string
### Customers Get Identity Verification

This is customers.getIdentityVerification operation.

**customers.getIdentityVerification**

```xml
<googleAdNetwork.customers.getIdentityVerification>
    <customerId>{$ctx:customerId}</customerId>
</googleAdNetwork.customers.getIdentityVerification>
```

**Properties**

* customerId: Required. The ID of the customer for whom we are requesting verification  information.
### Customers Google Ads Mutate

This is customers.googleAds.mutate operation.

**customers.googleAds.mutate**

```xml
<googleAdNetwork.customers.googleAds.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <mutateOperations[]>{$ctx:mutateOperations[]}</mutateOperations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.googleAds.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose resources are being modified.
* mutateOperations[]: Required. The list of operations to perform on individual resources. Type: object (MutateOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. The mutable resource will only be returned if the resource has the appropriate response field. For example, MutateCampaignResult.campaign. Type: enum (ResponseContentType)
### Customers Google Ads Search

This is customers.googleAds.search operation.

**customers.googleAds.search**

```xml
<googleAdNetwork.customers.googleAds.search>
    <customerId>{$ctx:customerId}</customerId>
    <query>{$ctx:query}</query>
    <pageToken>{$ctx:pageToken}</pageToken>
    <pageSize>{$ctx:pageSize}</pageSize>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <returnTotalResultsCount>{$ctx:returnTotalResultsCount}</returnTotalResultsCount>
    <summaryRowSetting>{$ctx:summaryRowSetting}</summaryRowSetting>
</googleAdNetwork.customers.googleAds.search>
```

**Properties**

* customerId: Required. The ID of the customer being queried.
* query: Required. The query string. Type: string
* pageToken: Token of the page to retrieve. If not specified, the first page of results will be returned. Use the value obtained fromnextPageTokenin the previous response in order to request the next page of results. Type: string
* pageSize: Number of elements to retrieve in a single page. When too large a page is requested, the server may decide to further limit the number of returned resources. Type: integer
* validateOnly: If true, the request is validated but not executed. Type: boolean
* returnTotalResultsCount: If true, the total number of results that match the query ignoring the LIMIT clause will be included in the response. Default is false. Type: boolean
* summaryRowSetting: Determines whether a summary row will be returned. By default, summary row is not returned. If requested, the summary row will be sent in a response by itself after all other query results are returned. Type: enum (SummaryRowSetting)
### Customers Google Ads Search Stream

This is customers.googleAds.searchStream operation.

**customers.googleAds.searchStream**

```xml
<googleAdNetwork.customers.googleAds.searchStream>
    <customerId>{$ctx:customerId}</customerId>
    <query>{$ctx:query}</query>
    <summaryRowSetting>{$ctx:summaryRowSetting}</summaryRowSetting>
</googleAdNetwork.customers.googleAds.searchStream>
```

**Properties**

* customerId: Required. The ID of the customer being queried.
* query: Required. The query string. Type: string
* summaryRowSetting: Determines whether a summary row will be returned. By default, summary row is not returned. If requested, the summary row will be sent in a response by itself after all other query results are returned. Type: enum (SummaryRowSetting)
### Customers Invoices List

This is customers.invoices.list operation.

**customers.invoices.list**

```xml
<googleAdNetwork.customers.invoices.list>
    <customerId>{$ctx:customerId}</customerId>
</googleAdNetwork.customers.invoices.list>
```

**Properties**

* customerId: Required. The ID of the customer to fetch invoices for.
### Customers Keyword Plan Ad Group Keywords Mutate

This is customers.keywordPlanAdGroupKeywords.mutate operation.

**customers.keywordPlanAdGroupKeywords.mutate**

```xml
<googleAdNetwork.customers.keywordPlanAdGroupKeywords.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.keywordPlanAdGroupKeywords.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose Keyword Plan ad group keywords are being modified.
* operations[]: Required. The list of operations to perform on individual Keyword Plan ad group keywords. Type: object (KeywordPlanAdGroupKeywordOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Keyword Plan Ad Groups Mutate

This is customers.keywordPlanAdGroups.mutate operation.

**customers.keywordPlanAdGroups.mutate**

```xml
<googleAdNetwork.customers.keywordPlanAdGroups.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.keywordPlanAdGroups.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose Keyword Plan ad groups are being modified.
* operations[]: Required. The list of operations to perform on individual Keyword Plan ad groups. Type: object (KeywordPlanAdGroupOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Keyword Plan Campaign Keywords Mutate

This is customers.keywordPlanCampaignKeywords.mutate operation.

**customers.keywordPlanCampaignKeywords.mutate**

```xml
<googleAdNetwork.customers.keywordPlanCampaignKeywords.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.keywordPlanCampaignKeywords.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose campaign keywords are being modified.
* operations[]: Required. The list of operations to perform on individual Keyword Plan campaign keywords. Type: object (KeywordPlanCampaignKeywordOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Keyword Plan Campaigns Mutate

This is customers.keywordPlanCampaigns.mutate operation.

**customers.keywordPlanCampaigns.mutate**

```xml
<googleAdNetwork.customers.keywordPlanCampaigns.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.keywordPlanCampaigns.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose Keyword Plan campaigns are being modified.
* operations[]: Required. The list of operations to perform on individual Keyword Plan campaigns. Type: object (KeywordPlanCampaignOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Keyword Plans Mutate

This is customers.keywordPlans.mutate operation.

**customers.keywordPlans.mutate**

```xml
<googleAdNetwork.customers.keywordPlans.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.keywordPlans.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose keyword plans are being modified.
* operations[]: Required. The list of operations to perform on individual keyword plans. Type: object (KeywordPlanOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Labels Mutate

This is customers.labels.mutate operation.

**customers.labels.mutate**

```xml
<googleAdNetwork.customers.labels.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.labels.mutate>
```

**Properties**

* customerId: Required. ID of the customer whose labels are being modified.
* operations[]: Required. The list of operations to perform on labels. Type: object (LabelOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers List Accessible Customers

This is customers.listAccessibleCustomers operation.

**customers.listAccessibleCustomers**

```xml
<googleAdNetwork.customers.listAccessibleCustomers>
</googleAdNetwork.customers.listAccessibleCustomers>
```

**Properties**

### Customers Local Services Append Lead Conversation

This is customers.localServices.appendLeadConversation operation.

**customers.localServices.appendLeadConversation**

```xml
<googleAdNetwork.customers.localServices.appendLeadConversation>
    <customerId>{$ctx:customerId}</customerId>
    <conversations[]>{$ctx:conversations[]}</conversations[]>
</googleAdNetwork.customers.localServices.appendLeadConversation>
```

**Properties**

* customerId: Required. The Id of the customer which owns the leads onto which the conversations will be appended.
* conversations[]: Required. Conversations that are being appended. Type: object (Conversation)
### Customers Mutate

This is customers.mutate operation.

**customers.mutate**

```xml
<googleAdNetwork.customers.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operation>{$ctx:operation}</operation>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.mutate>
```

**Properties**

* customerId: Required. The ID of the customer being modified.
* operation: Required. The operation to perform on the customer Type: object (CustomerOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Offline User Data Jobs Add Operations

This is customers.offlineUserDataJobs.addOperations operation.

**customers.offlineUserDataJobs.addOperations**

```xml
<googleAdNetwork.customers.offlineUserDataJobs.addOperations>
    <resourceName>{$ctx:resourceName}</resourceName>
    <operations[]>{$ctx:operations[]}</operations[]>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <enablePartialFailure>{$ctx:enablePartialFailure}</enablePartialFailure>
    <enableWarnings>{$ctx:enableWarnings}</enableWarnings>
</googleAdNetwork.customers.offlineUserDataJobs.addOperations>
```

**Properties**

* resourceName: Required. The resource name of the OfflineUserDataJob.
* operations[]: Required. The list of operations to be done. Type: object (OfflineUserDataJobOperation)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* enablePartialFailure: True to enable partial failure for the offline user data job. Type: boolean
* enableWarnings: True to enable warnings for the offline user data job. When enabled, a warning will not block the OfflineUserDataJobOperation, and will also return warning messages about malformed field values. Type: boolean
### Customers Offline User Data Jobs Create

This is customers.offlineUserDataJobs.create operation.

**customers.offlineUserDataJobs.create**

```xml
<googleAdNetwork.customers.offlineUserDataJobs.create>
    <customerId>{$ctx:customerId}</customerId>
    <job>{$ctx:job}</job>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <enableMatchRateRangePreview>{$ctx:enableMatchRateRangePreview}</enableMatchRateRangePreview>
</googleAdNetwork.customers.offlineUserDataJobs.create>
```

**Properties**

* customerId: Required. The ID of the customer for which to create an offline user data job.
* job: Required. The offline user data job to be created. Type: object (OfflineUserDataJob)
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* enableMatchRateRangePreview: If true, match rate range for the offline user data job is calculated and made available in the resource. Type: boolean
### Customers Offline User Data Jobs Run

This is customers.offlineUserDataJobs.run operation.

**customers.offlineUserDataJobs.run**

```xml
<googleAdNetwork.customers.offlineUserDataJobs.run>
    <resourceName>{$ctx:resourceName}</resourceName>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.offlineUserDataJobs.run>
```

**Properties**

* resourceName: Required. The resource name of the OfflineUserDataJob to run.
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Operations Cancel

This is customers.operations.cancel operation.

**customers.operations.cancel**

```xml
<googleAdNetwork.customers.operations.cancel>
    <name>{$ctx:name}</name>
</googleAdNetwork.customers.operations.cancel>
```

**Properties**

* name: The name of the operation resource to be cancelled.
### Customers Operations Get

This is customers.operations.get operation.

**customers.operations.get**

```xml
<googleAdNetwork.customers.operations.get>
    <name>{$ctx:name}</name>
</googleAdNetwork.customers.operations.get>
```

**Properties**

* name: The name of the operation resource.
### Customers Operations List

This is customers.operations.list operation.

**customers.operations.list**

```xml
<googleAdNetwork.customers.operations.list>
    <name>{$ctx:name}</name>
</googleAdNetwork.customers.operations.list>
```

**Properties**

* name: The name of the operation's parent resource.
### Customers Operations Wait

This is customers.operations.wait operation.

**customers.operations.wait**

```xml
<googleAdNetwork.customers.operations.wait>
    <name>{$ctx:name}</name>
    <timeout>{$ctx:timeout}</timeout>
</googleAdNetwork.customers.operations.wait>
```

**Properties**

* name: The name of the operation resource to wait on.
* timeout: The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used. Type: string (Durationformat)
### Customers Payments Accounts List

This is customers.paymentsAccounts.list operation.

**customers.paymentsAccounts.list**

```xml
<googleAdNetwork.customers.paymentsAccounts.list>
    <customerId>{$ctx:customerId}</customerId>
</googleAdNetwork.customers.paymentsAccounts.list>
```

**Properties**

* customerId: Required. The ID of the customer to apply the PaymentsAccount list operation to.
### Customers Product Link Invitations Create

This is customers.productLinkInvitations.create operation.

**customers.productLinkInvitations.create**

```xml
<googleAdNetwork.customers.productLinkInvitations.create>
    <customerId>{$ctx:customerId}</customerId>
    <productLinkInvitation>{$ctx:productLinkInvitation}</productLinkInvitation>
</googleAdNetwork.customers.productLinkInvitations.create>
```

**Properties**

* customerId: Required. The ID of the customer being modified.
* productLinkInvitation: Required. The product link invitation to be created. Type: object (ProductLinkInvitation)
### Customers Product Link Invitations Remove

This is customers.productLinkInvitations.remove operation.

**customers.productLinkInvitations.remove**

```xml
<googleAdNetwork.customers.productLinkInvitations.remove>
    <customerId>{$ctx:customerId}</customerId>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.productLinkInvitations.remove>
```

**Properties**

* customerId: Required. The ID of the product link invitation being removed.
* resourceName: Required. The resource name of the product link invitation being removed. expected, in this format: Type: string
### Customers Product Link Invitations Update

This is customers.productLinkInvitations.update operation.

**customers.productLinkInvitations.update**

```xml
<googleAdNetwork.customers.productLinkInvitations.update>
    <customerId>{$ctx:customerId}</customerId>
    <productLinkInvitationStatus>{$ctx:productLinkInvitationStatus}</productLinkInvitationStatus>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.productLinkInvitations.update>
```

**Properties**

* customerId: Required. The ID of the customer being modified.
* productLinkInvitationStatus: Required. The product link invitation to be created. Type: enum (ProductLinkInvitationStatus)
* resourceName: Required. Resource name of the product link invitation. Type: string
### Customers Product Links Create

This is customers.productLinks.create operation.

**customers.productLinks.create**

```xml
<googleAdNetwork.customers.productLinks.create>
    <customerId>{$ctx:customerId}</customerId>
    <productLink>{$ctx:productLink}</productLink>
</googleAdNetwork.customers.productLinks.create>
```

**Properties**

* customerId: Required. The ID of the customer for which the product link is created.
* productLink: Required. The product link to be created. Type: object (ProductLink)
### Customers Product Links Remove

This is customers.productLinks.remove operation.

**customers.productLinks.remove**

```xml
<googleAdNetwork.customers.productLinks.remove>
    <customerId>{$ctx:customerId}</customerId>
    <resourceName>{$ctx:resourceName}</resourceName>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.productLinks.remove>
```

**Properties**

* customerId: Required. The ID of the customer being modified.
* resourceName: Required. Remove operation: A resource name for the product link to remove is expected, in this format: Type: string
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Recommendation Subscriptions Mutate Recommendation Subscription

This is customers.recommendationSubscriptions.mutateRecommendationSubscription operation.

**customers.recommendationSubscriptions.mutateRecommendationSubscription**

```xml
<googleAdNetwork.customers.recommendationSubscriptions.mutateRecommendationSubscription>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.recommendationSubscriptions.mutateRecommendationSubscription>
```

**Properties**

* customerId: Required. The ID of the subscribing customer.
* operations[]: Required. The list of create or update operations. Type: object (RecommendationSubscriptionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. The mutable resource will only be returned if the resource has the appropriate response field. For example, MutateCampaignResult.campaign. Type: enum (ResponseContentType)
### Customers Recommendations Apply

This is customers.recommendations.apply operation.

**customers.recommendations.apply**

```xml
<googleAdNetwork.customers.recommendations.apply>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
</googleAdNetwork.customers.recommendations.apply>
```

**Properties**

* customerId: Required. The ID of the customer with the recommendation.
* operations[]: Required. The list of operations to apply recommendations. If partialFailure=false all recommendations should be of the same type There is a limit of 100 operations per request. Type: object (ApplyRecommendationOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, operations will be carried out as a transaction if and only if they are all valid. Default is false. Type: boolean
### Customers Recommendations Dismiss

This is customers.recommendations.dismiss operation.

**customers.recommendations.dismiss**

```xml
<googleAdNetwork.customers.recommendations.dismiss>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
</googleAdNetwork.customers.recommendations.dismiss>
```

**Properties**

* customerId: Required. The ID of the customer with the recommendation.
* operations[]: Required. The list of operations to dismiss recommendations. If partialFailure=false all recommendations should be of the same type There is a limit of 100 operations per request. Type: object (DismissRecommendationOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, operations will be carried in a single transaction if and only if they are all valid. Default is false. Type: boolean
### Customers Recommendations Generate

This is customers.recommendations.generate operation.

**customers.recommendations.generate**

```xml
<googleAdNetwork.customers.recommendations.generate>
    <customerId>{$ctx:customerId}</customerId>
    <recommendationTypes[]>{$ctx:recommendationTypes[]}</recommendationTypes[]>
    <advertisingChannelType>{$ctx:advertisingChannelType}</advertisingChannelType>
    <adGroupInfo[]>{$ctx:adGroupInfo[]}</adGroupInfo[]>
    <campaignSitelinkCount>{$ctx:campaignSitelinkCount}</campaignSitelinkCount>
    <conversionTrackingStatus>{$ctx:conversionTrackingStatus}</conversionTrackingStatus>
    <biddingInfo>{$ctx:biddingInfo}</biddingInfo>
    <seedInfo>{$ctx:seedInfo}</seedInfo>
</googleAdNetwork.customers.recommendations.generate>
```

**Properties**

* customerId: Required. The ID of the customer generating recommendations.
* recommendationTypes[]: Required. List of eligible recommendationTypes to generate. If the uploaded criteria isn't sufficient to make a recommendation, or the campaign is already in the recommended state, no recommendation will be returned for that type. Generally, a recommendation is returned if all required fields for that recommendationType are uploaded, but there are cases where this is still not sufficient. Type: enum (RecommendationType)
* advertisingChannelType: Required. Advertising channel type of the campaign. The following advertisingChannelTypes are supported for recommendation generation: PERFORMANCE_MAX and SEARCH Type: enum (AdvertisingChannelType)
* adGroupInfo[]: Optional. Current AdGroup Information. Supports information from a single AdGroup. This field is optional for the following recommendationTypes: KEYWORD Type: object (AdGroupInfo)
* campaignSitelinkCount: Optional. Number of sitelinks on the campaign. This field is necessary for the following recommendationTypes: SITELINK_ASSET Type: integer
* conversionTrackingStatus: Optional. Current conversion tracking status. This field is necessary for the following recommendationTypes: MAXIMIZE_CLICKS_OPT_IN, MAXIMIZE_CONVERSIONS_OPT_IN, MAXIMIZE_CONVERSION_VALUE_OPT_IN, SET_TARGET_CPA, SET_TARGET_ROAS, TARGET_CPA_OPT_IN, TARGET_ROAS_OPT_IN Type: enum (ConversionTrackingStatus)
* biddingInfo: Optional. Current bidding information of the campaign. This field is necessary for the following recommendationTypes: MAXIMIZE_CLICKS_OPT_IN, MAXIMIZE_CONVERSIONS_OPT_IN, MAXIMIZE_CONVERSION_VALUE_OPT_IN, SET_TARGET_CPA, SET_TARGET_ROAS, TARGET_CPA_OPT_IN, TARGET_ROAS_OPT_IN Type: object (BiddingInfo)
* seedInfo: Optional. Seed information for Keywords. This field is necessary for the following recommendationTypes: KEYWORD Type: object (SeedInfo)
### Customers Remarketing Actions Mutate

This is customers.remarketingActions.mutate operation.

**customers.remarketingActions.mutate**

```xml
<googleAdNetwork.customers.remarketingActions.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.remarketingActions.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose remarketing actions are being modified.
* operations[]: Required. The list of operations to perform on individual remarketing actions. Type: object (RemarketingActionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Search Audience Insights Attributes

This is customers.searchAudienceInsightsAttributes operation.

**customers.searchAudienceInsightsAttributes**

```xml
<googleAdNetwork.customers.searchAudienceInsightsAttributes>
    <customerId>{$ctx:customerId}</customerId>
    <dimensions[]>{$ctx:dimensions[]}</dimensions[]>
    <queryText>{$ctx:queryText}</queryText>
    <customerInsightsGroup>{$ctx:customerInsightsGroup}</customerInsightsGroup>
    <locationCountryFilters[]>{$ctx:locationCountryFilters[]}</locationCountryFilters[]>
    <youtubeReachLocation>{$ctx:youtubeReachLocation}</youtubeReachLocation>
</googleAdNetwork.customers.searchAudienceInsightsAttributes>
```

**Properties**

* customerId: Required. The ID of the customer.
* dimensions[]: Required. The types of attributes to be returned. Type: enum (AudienceInsightsDimension)
* queryText: Required. A free text query. If the requested dimensions include Attributes CATEGORY or KNOWLEDGE_GRAPH, then the attributes returned for those dimensions will match or be related to this string. For other dimensions, this field is ignored and all available attributes are returned. Type: string
* customerInsightsGroup: The name of the customer being planned for. This is a user-defined value. Type: string
* locationCountryFilters[]: If SUB_COUNTRY_LOCATION attributes are one of the requested dimensions and this field is present, then the SUB_COUNTRY_LOCATION attributes returned will be located in these countries. If this field is absent, then location attributes are not filtered by country. Setting this field when SUB_COUNTRY_LOCATION attributes are not requested will return an error. Type: object (LocationInfo)
* youtubeReachLocation: If present, potential YouTube reach estimates within the specified market will be returned for attributes for which they are available. Reach is only available for the AGE_RANGE, GENDER, AFFINITY_USER_INTEREST and IN_MARKET_USER_INTEREST dimensions, and may not be available for every attribute of those dimensions in every market. Type: object (LocationInfo)
### Customers Shared Criteria Mutate

This is customers.sharedCriteria.mutate operation.

**customers.sharedCriteria.mutate**

```xml
<googleAdNetwork.customers.sharedCriteria.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.sharedCriteria.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose shared criteria are being modified.
* operations[]: Required. The list of operations to perform on individual shared criteria. Type: object (SharedCriterionOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Shared Sets Mutate

This is customers.sharedSets.mutate operation.

**customers.sharedSets.mutate**

```xml
<googleAdNetwork.customers.sharedSets.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.sharedSets.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose shared sets are being modified.
* operations[]: Required. The list of operations to perform on individual shared sets. Type: object (SharedSetOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Smart Campaign Settings Get Smart Campaign Status

This is customers.smartCampaignSettings.getSmartCampaignStatus operation.

**customers.smartCampaignSettings.getSmartCampaignStatus**

```xml
<googleAdNetwork.customers.smartCampaignSettings.getSmartCampaignStatus>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.smartCampaignSettings.getSmartCampaignStatus>
```

**Properties**

* resourceName: Required. The resource name of the Smart campaign setting belonging to the Smart campaign to fetch the status of.
### Customers Smart Campaign Settings Mutate

This is customers.smartCampaignSettings.mutate operation.

**customers.smartCampaignSettings.mutate**

```xml
<googleAdNetwork.customers.smartCampaignSettings.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <responseContentType>{$ctx:responseContentType}</responseContentType>
</googleAdNetwork.customers.smartCampaignSettings.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose Smart campaign settings are being modified.
* operations[]: Required. The list of operations to perform on individual Smart campaign settings. Type: object (SmartCampaignSettingOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* responseContentType: The response content type setting. Determines whether the mutable resource or just the resource name should be returned post mutation. Type: enum (ResponseContentType)
### Customers Start Identity Verification

This is customers.startIdentityVerification operation.

**customers.startIdentityVerification**

```xml
<googleAdNetwork.customers.startIdentityVerification>
    <customerId>{$ctx:customerId}</customerId>
    <verificationProgram>{$ctx:verificationProgram}</verificationProgram>
</googleAdNetwork.customers.startIdentityVerification>
```

**Properties**

* customerId: Required. The Id of the customer for whom we are creating this verification.
* verificationProgram: Required. The verification program type for which we want to start the verification. Type: enum (IdentityVerificationProgram)
### Customers Suggest Brands

This is customers.suggestBrands operation.

**customers.suggestBrands**

```xml
<googleAdNetwork.customers.suggestBrands>
    <customerId>{$ctx:customerId}</customerId>
    <selectedBrands[]>{$ctx:selectedBrands[]}</selectedBrands[]>
    <brandPrefix>{$ctx:brandPrefix}</brandPrefix>
</googleAdNetwork.customers.suggestBrands>
```

**Properties**

* customerId: Required. The ID of the customer onto which to apply the brand suggestion operation.
* selectedBrands[]: Optional. Ids of the brands already selected by advertisers. They will be excluded in response. These are expected to be brand ids not brand names. Type: string
* brandPrefix: Required. The prefix of a brand name. Type: string
### Customers Suggest Keyword Themes

This is customers.suggestKeywordThemes operation.

**customers.suggestKeywordThemes**

```xml
<googleAdNetwork.customers.suggestKeywordThemes>
    <customerId>{$ctx:customerId}</customerId>
    <suggestionInfo>{$ctx:suggestionInfo}</suggestionInfo>
</googleAdNetwork.customers.suggestKeywordThemes>
```

**Properties**

* customerId: Required. The ID of the customer.
* suggestionInfo: Required. Information to get keyword theme suggestions. Required fields: Type: object (SmartCampaignSuggestionInfo)
### Customers Suggest Smart Campaign Ad

This is customers.suggestSmartCampaignAd operation.

**customers.suggestSmartCampaignAd**

```xml
<googleAdNetwork.customers.suggestSmartCampaignAd>
    <customerId>{$ctx:customerId}</customerId>
    <suggestionInfo>{$ctx:suggestionInfo}</suggestionInfo>
</googleAdNetwork.customers.suggestSmartCampaignAd>
```

**Properties**

* customerId: Required. The ID of the customer.
* suggestionInfo: Required. Inputs used to suggest a Smart campaign ad. Required fields: finalUrl, languageCode, keywordThemes. Optional but recommended fields to improve the quality of the suggestion: business_setting and geo_target. Type: object (SmartCampaignSuggestionInfo)
### Customers Suggest Smart Campaign Budget Options

This is customers.suggestSmartCampaignBudgetOptions operation.

**customers.suggestSmartCampaignBudgetOptions**

```xml
<googleAdNetwork.customers.suggestSmartCampaignBudgetOptions>
    <customerId>{$ctx:customerId}</customerId>
    <campaign>{$ctx:campaign}</campaign>
    <suggestionInfo>{$ctx:suggestionInfo}</suggestionInfo>
</googleAdNetwork.customers.suggestSmartCampaignBudgetOptions>
```

**Properties**

* customerId: Required. The ID of the customer whose budget options are to be suggested.
* campaign: Required. The resource name of the campaign to get suggestion for. Type: string
* suggestionInfo: Required. Information needed to get budget options Type: object (SmartCampaignSuggestionInfo)
### Customers Suggest Travel Assets

This is customers.suggestTravelAssets operation.

**customers.suggestTravelAssets**

```xml
<googleAdNetwork.customers.suggestTravelAssets>
    <customerId>{$ctx:customerId}</customerId>
    <languageOption>{$ctx:languageOption}</languageOption>
    <placeIds[]>{$ctx:placeIds[]}</placeIds[]>
</googleAdNetwork.customers.suggestTravelAssets>
```

**Properties**

* customerId: Required. The ID of the customer.
* languageOption: Required. The language specifications in BCP 47 format (for example, en-US, zh-CN, etc.) for the asset suggestions. Text will be in this language. Usually matches one of the campaign target languages. Type: string
* placeIds[]: The Google Maps Place IDs of hotels for which assets are requested. Seehttps://developers.google.com/places/web-service/place-idfor more information. Type: string
### Customers Third Party App Analytics Links Regenerate Shareable Link Id

This is customers.thirdPartyAppAnalyticsLinks.regenerateShareableLinkId operation.

**customers.thirdPartyAppAnalyticsLinks.regenerateShareableLinkId**

```xml
<googleAdNetwork.customers.thirdPartyAppAnalyticsLinks.regenerateShareableLinkId>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.customers.thirdPartyAppAnalyticsLinks.regenerateShareableLinkId>
```

**Properties**

* resourceName: Resource name of the third party app analytics link.
### Customers Upload Call Conversions

This is customers.uploadCallConversions operation.

**customers.uploadCallConversions**

```xml
<googleAdNetwork.customers.uploadCallConversions>
    <customerId>{$ctx:customerId}</customerId>
    <conversions[]>{$ctx:conversions[]}</conversions[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.uploadCallConversions>
```

**Properties**

* customerId: Required. The ID of the customer performing the upload.
* conversions[]: Required. The conversions that are being uploaded. Type: object (CallConversion)
* partialFailure: Required. If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. This should always be set to true. Seehttps://developers.google.com/google-ads/api/docs/best-practices/partial-failuresfor more information about partial failure. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers Upload Click Conversions

This is customers.uploadClickConversions operation.

**customers.uploadClickConversions**

```xml
<googleAdNetwork.customers.uploadClickConversions>
    <customerId>{$ctx:customerId}</customerId>
    <conversions[]>{$ctx:conversions[]}</conversions[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <debugEnabled>{$ctx:debugEnabled}</debugEnabled>
    <jobId>{$ctx:jobId}</jobId>
</googleAdNetwork.customers.uploadClickConversions>
```

**Properties**

* customerId: Required. The ID of the customer performing the upload.
* conversions[]: Required. The conversions that are being uploaded. Type: object (ClickConversion)
* partialFailure: Required. If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. This should always be set to true. Seehttps://developers.google.com/google-ads/api/docs/best-practices/partial-failuresfor more information about partial failure. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* debugEnabled: If true, the API will perform all upload checks and return errors if any are found. If false, it will perform only basic input validation, skip subsequent upload checks, and return success even if no click was found for the provideduserIdentifiers. Type: boolean
* jobId: Optional. Optional input to set job ID. Must be a non-negative number that is less than 2^31 if provided. If this field is not provided, the API will generate a job ID in the range [2^31, (2^63)-1]. The API will return the value for this request in thejobIdfield of theUploadClickConversionsResponse. Type: integer
### Customers Upload Conversion Adjustments

This is customers.uploadConversionAdjustments operation.

**customers.uploadConversionAdjustments**

```xml
<googleAdNetwork.customers.uploadConversionAdjustments>
    <customerId>{$ctx:customerId}</customerId>
    <conversionAdjustments[]>{$ctx:conversionAdjustments[]}</conversionAdjustments[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
    <jobId>{$ctx:jobId}</jobId>
</googleAdNetwork.customers.uploadConversionAdjustments>
```

**Properties**

* customerId: Required. The ID of the customer performing the upload.
* conversionAdjustments[]: Required. The conversion adjustments that are being uploaded. Type: object (ConversionAdjustment)
* partialFailure: Required. If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. This should always be set to true. Seehttps://developers.google.com/google-ads/api/docs/best-practices/partial-failuresfor more information about partial failure. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
* jobId: Optional. Optional input to set job ID. Must be a non-negative number that is less than 2^31 if provided. If this field is not provided, the API will generate a job ID in the range [2^31, (2^63)-1]. The API will return the value for this request in thejobIdfield of theUploadConversionAdjustmentsResponse. Type: integer
### Customers Upload User Data

This is customers.uploadUserData operation.

**customers.uploadUserData**

```xml
<googleAdNetwork.customers.uploadUserData>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <customerMatchUserListMetadata>{$ctx:customerMatchUserListMetadata}</customerMatchUserListMetadata>
</googleAdNetwork.customers.uploadUserData>
```

**Properties**

* customerId: Required. The ID of the customer for which to update the user data.
* operations[]: Required. The list of operations to be done. Type: object (UserDataOperation)
* customerMatchUserListMetadata: Metadata for data updates to a Customer Match user list. Type: object (CustomerMatchUserListMetadata)
### Customers User List Customer Types Mutate

This is customers.userListCustomerTypes.mutate operation.

**customers.userListCustomerTypes.mutate**

```xml
<googleAdNetwork.customers.userListCustomerTypes.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.userListCustomerTypes.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose user list customer types are being modified.
* operations[]: Required. The list of operations to perform on the user list customer types. Type: object (UserListCustomerTypeOperation)
* partialFailure: Optional. If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: Optional. If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Customers User Lists Mutate

This is customers.userLists.mutate operation.

**customers.userLists.mutate**

```xml
<googleAdNetwork.customers.userLists.mutate>
    <customerId>{$ctx:customerId}</customerId>
    <operations[]>{$ctx:operations[]}</operations[]>
    <partialFailure>{$ctx:partialFailure}</partialFailure>
    <validateOnly>{$ctx:validateOnly}</validateOnly>
</googleAdNetwork.customers.userLists.mutate>
```

**Properties**

* customerId: Required. The ID of the customer whose user lists are being modified.
* operations[]: Required. The list of operations to perform on individual user lists. Type: object (UserListOperation)
* partialFailure: If true, successful operations will be carried out and invalid operations will return errors. If false, all operations will be carried out in one transaction if and only if they are all valid. Default is false. Type: boolean
* validateOnly: If true, the request is validated but not executed. Only errors are returned, not results. Type: boolean
### Geo Target Constants Suggest

This is geoTargetConstants.suggest operation.

**geoTargetConstants.suggest**

```xml
<googleAdNetwork.geoTargetConstants.suggest>
    <locale>{$ctx:locale}</locale>
    <countryCode>{$ctx:countryCode}</countryCode>
    <locationNames>{$ctx:locationNames}</locationNames>
    <geoTargets>{$ctx:geoTargets}</geoTargets>
</googleAdNetwork.geoTargetConstants.suggest>
```

**Properties**

* locale: If possible, returned geo targets are translated using this locale. If not, en is used by default. This is also used as a hint for returned geo targets. Type: string
* countryCode: Returned geo targets are restricted to this country code. Type: string
* locationNames: The location names to search by. At most 25 names can be set. Type: object (LocationNames)
* geoTargets: The geo target constant resource names to filter by. Type: object (GeoTargets)
### Google Ads Fields Get

This is googleAdsFields.get operation.

**googleAdsFields.get**

```xml
<googleAdNetwork.googleAdsFields.get>
    <resourceName>{$ctx:resourceName}</resourceName>
</googleAdNetwork.googleAdsFields.get>
```

**Properties**

* resourceName: Required. The resource name of the field to get.
### Google Ads Fields Search

This is googleAdsFields.search operation.

**googleAdsFields.search**

```xml
<googleAdNetwork.googleAdsFields.search>
    <query>{$ctx:query}</query>
    <pageToken>{$ctx:pageToken}</pageToken>
    <pageSize>{$ctx:pageSize}</pageSize>
</googleAdNetwork.googleAdsFields.search>
```

**Properties**

* query: Required. The query string. Type: string
* pageToken: Token of the page to retrieve. If not specified, the first page of results will be returned. Use the value obtained fromnextPageTokenin the previous response in order to request the next page of results. Type: string
* pageSize: Number of elements to retrieve in a single page. When too large a page is requested, the server may decide to further limit the number of returned resources. Type: integer
### Keyword Theme Constants Suggest

This is keywordThemeConstants.suggest operation.

**keywordThemeConstants.suggest**

```xml
<googleAdNetwork.keywordThemeConstants.suggest>
    <queryText>{$ctx:queryText}</queryText>
    <countryCode>{$ctx:countryCode}</countryCode>
    <languageCode>{$ctx:languageCode}</languageCode>
</googleAdNetwork.keywordThemeConstants.suggest>
```

**Properties**

* queryText: The query text of a keyword theme that will be used to map to similar keyword themes. For example, "plumber" or "roofer". Type: string
* countryCode: Upper-case, two-letter country code as defined by ISO-3166. This for refining the scope of the query, default to 'US' if not set. Type: string
* languageCode: The two letter language code for get corresponding keyword theme for refining the scope of the query, default to 'en' if not set. Type: string
### List Plannable Locations

This is listPlannableLocations operation.

**listPlannableLocations**

```xml
<googleAdNetwork.listPlannableLocations>
</googleAdNetwork.listPlannableLocations>
```

**Properties**

### List Plannable Products

This is listPlannableProducts operation.

**listPlannableProducts**

```xml
<googleAdNetwork.listPlannableProducts>
    <plannableLocationId>{$ctx:plannableLocationId}</plannableLocationId>
</googleAdNetwork.listPlannableProducts>
```

**Properties**

* plannableLocationId: Required. The ID of the selected location for planning. To list the available plannable location IDs useReachPlanService.ListPlannableLocations. Type: string
